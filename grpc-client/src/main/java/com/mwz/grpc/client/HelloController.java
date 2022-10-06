package com.mwz.grpc.client;

import com.mwz.grpc.api.GreeterGrpc;
import com.mwz.grpc.api.HelloReply;
import com.mwz.grpc.api.HelloRequest;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }

    @GrpcClient("grpc-service")
    private GreeterGrpc.GreeterBlockingStub greeterBlockingStub;


    @GetMapping("hello-grpc")
    public String helloGrpc() {
        try {
            HelloReply response = greeterBlockingStub.sayHello(HelloRequest.newBuilder().setName("haha").build());
            return response.getMessage();

        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode();
        }
    }

}
