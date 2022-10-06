package com.mwz.grpc.service;

import com.mwz.grpc.api.GreeterGrpc;
import com.mwz.grpc.api.HelloReply;
import com.mwz.grpc.api.HelloRequest;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class GrpcServerService extends GreeterGrpc.GreeterImplBase  {

    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello ==> " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
