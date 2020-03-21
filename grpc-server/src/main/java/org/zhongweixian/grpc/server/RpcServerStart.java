package org.zhongweixian.grpc.server;

import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.zhongweixian.grpc.user.UserServiceGrpc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.TimeUnit;

/**
 * Created by caoliang on 2020-03-13
 */
@Component
public class RpcServerStart {
    private Logger logger = LoggerFactory.getLogger(RpcServerStart.class);

    private Server server;


    @Autowired
    private UserServiceGrpc.UserServiceImplBase userService;

    @Value("${rpc.port:8888}")
    private Integer port;

    @PostConstruct
    public void start() throws Exception {
        server = NettyServerBuilder.forPort(port)
                .addService(userService.bindService())
                .build();
        server.start();

        logger.info("grpc server start on port:{}", port);
    }


    @PreDestroy
    private void stop() {
        try {
            server.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            logger.error("{}", e);
        }
    }


}
