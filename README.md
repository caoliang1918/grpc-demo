## grpc-demo


# 1. 构建工程：
```shell script
    mvn install 
``` 
# 2.本地运行： 
```shell script
   run grpc server:
      java -jar grpc-server-1.0.0-SNAPSHOT.jar

   run grpc client:
      java -jar grpc-client-1.0.0-SNAPSHOT.jar
```

# 3 定制.proto

```proto
    syntax = "proto3";
    
    option java_multiple_files = true;
    option java_outer_classname = "UserServiceProto";
    
    
    import "google/protobuf/empty.proto";
    import "google/protobuf/wrappers.proto";
    
    package org.zhongweixian.grpc.user;
    
    service UserService {
        //request or response must be message
        rpc getUser (google.protobuf.StringValue) returns (UserResponse);
    
        //request get all response
        rpc UserLogin (LoginRequest) returns (stream UserLoginResponse);
    
        //client and server instant messenger
        rpc WeChat (stream StromRequest) returns (stream StromResponse);
    }
    
    message LoginRequest {
        string username = 1;
        string password = 2;
    }
    
    message UserLoginResponse {
        int32 uid = 1;
        string username = 2;
        Role role = 3;
        WorkType workType = 4;
    }
    
    enum Role {
        admin = 0;
        user = 1;
    }
    
    message UserResponse {
        int32 uid = 1;
        string username = 2;
    
    }
    
    enum WorkType {
        mobile = 0;
        webcall = 1;
        sip = 2;
    }
    
    
    message StromRequest {
        string request = 1;
    }
    message StromResponse {
        string response = 1;
    }

```