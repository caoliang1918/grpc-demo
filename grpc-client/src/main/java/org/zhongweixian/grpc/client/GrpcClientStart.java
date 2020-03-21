package org.zhongweixian.grpc.client;


import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.zhongweixian.grpc.user.LoginRequest;
import org.zhongweixian.grpc.user.UserLoginResponse;
import org.zhongweixian.grpc.user.UserServiceGrpc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by caoliang on 2020-03-13
 */
@Component
public class GrpcClientStart {
    private Logger logger = LoggerFactory.getLogger(GrpcClientStart.class);

    private ManagedChannel managedChannel;

    @Value("${rpc.host}")
    private String host;

    @Value("${rpc.port}")
    private Integer port;

    private ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);


    private UserServiceGrpc.UserServiceBlockingStub userService;

    @PostConstruct
    public void createChannel() {
        SocketAddress socketAddress = new InetSocketAddress(host, port);
        try {
            managedChannel = NettyChannelBuilder.forAddress(socketAddress).usePlaintext().build();
        } catch (Exception e) {
            logger.error("rpc connect error:{}", e);
        }

        /**
         * init service
         */
        if (managedChannel == null) {
            return;
        }
        userService = UserServiceGrpc.newBlockingStub(managedChannel);

        executor.scheduleAtFixedRate(() -> {
            try {
                LoginRequest loginRequest = LoginRequest.newBuilder().setUsername("admin01").setPassword("123456").build();
                UserLoginResponse loginResponse = userService.userLogin(loginRequest).next();
                logger.info("loginRequest ,uid:{} , username:{} , role:{} , workType:{}", loginResponse.getUid(), loginResponse.getUsername(), loginResponse.getRole(), loginResponse.getWorkType());
            } catch (Exception e) {
                logger.error("{}", e);
            }

        }, 1, 10, TimeUnit.SECONDS);
    }


    @PreDestroy
    private void shutdown() {
        if (managedChannel != null) {
            try {
                managedChannel.shutdown().awaitTermination(2, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                logger.error("{}", e);
            }
        }
    }
}
