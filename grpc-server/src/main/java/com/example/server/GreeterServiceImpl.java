package com.example.server;

import com.example.proto.GreeterGrpc;
import com.example.proto.HelloReply;
import com.example.proto.HelloRequest;
import io.grpc.stub.StreamObserver;

public class GreeterServiceImpl extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String name = request.getName();
        HelloReply reply = HelloReply.newBuilder()
            .setMessage("Hello, " + name + "!!!!! done good job")
            .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
