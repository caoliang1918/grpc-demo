package org.zhongweixian.grpc.server.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.zhongweixian.grpc.user.Role;
import org.zhongweixian.grpc.user.UserLoginResponse;
import org.zhongweixian.grpc.user.UserServiceGrpc;
import org.zhongweixian.grpc.user.WorkType;

/**
 * Created by caoliang on 2020-03-13
 */
@Service
public class UserServerImpl extends UserServiceGrpc.UserServiceImplBase {
    private Logger logger = LoggerFactory.getLogger(UserServerImpl.class);


    public void getUser(com.google.protobuf.StringValue request,
                        io.grpc.stub.StreamObserver<org.zhongweixian.grpc.user.UserResponse> responseObserver) {

    }

    /**
     * <pre>
     * request get all response
     * </pre>
     */
    public void userLogin(org.zhongweixian.grpc.user.LoginRequest request,
                          io.grpc.stub.StreamObserver<org.zhongweixian.grpc.user.UserLoginResponse> responseObserver) {
        logger.info("userLogin username:{} , password:{}", request.getUsername(), request.getPassword());
        UserLoginResponse userLoginResponse = UserLoginResponse.newBuilder()
                .setUid(100)
                .setUsername(request.getUsername())
                .setRole(Role.admin)
                .setWorkType(WorkType.mobile)
                .build();
        responseObserver.onNext(userLoginResponse);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     * client and server instant messenger
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.zhongweixian.grpc.user.StromRequest> weChat(
            io.grpc.stub.StreamObserver<org.zhongweixian.grpc.user.StromResponse> responseObserver) {
        return null;
    }

}
