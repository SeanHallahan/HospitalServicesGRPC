package com.proto.beds;

import com.proto.beds.BedsAvailableRequestGrpc.BedsAvailableRequestBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HospitalServiceClient {

	public static void main(String[] args) {
		
		String host = "localhost";
		int port = 50051;
		
		//Preparing the channel
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();
		
		//Preparing the message that I should send
		WelcomeRequest request = WelcomeRequest.newBuilder()
				.setName("John Smith")
				.setNumber(15)
				.build();
		
		//I want to send the message via the method of a stub
		//blocking is synchronous invocation
		BedsAvailableRequestBlockingStub stub = BedsAvailableRequestGrpc.newBlockingStub(channel);
		
		//This is the rpc invocation
		BedsAvailableResponse response = stub.sayWelcome(request);
		
		System.out.println("received message" + response.getMessage());

	}

}
