package com.proto.beds;


import java.io.IOException;

import com.proto.beds.BedsAvailableRequestGrpc.BedsAvailableRequestImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//This class will serve both as a server for my service
//and also for implementing the service behavior - methods.

public class HospitalServer extends BedsAvailableRequestImplBase {

	public static void main(String[] args) {
		
		HospitalServer hospitalservice = new HospitalServer();
		
		int port = 50051;
		
		try {
			Server server = ServerBuilder.forPort(port)
				.addService(hospitalservice)
				.build()
				.start();
			
			System.out.println("server waiting for requests");
			
			//here we are blocking and waiting for client requests
			server.awaitTermination();
		}
		catch (IOException e) {
			e.printStackTrace();
			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			
		}

	}
	
	//Implementing the service method 
	
	public void sayWelcome(WelcomeRequest request, StreamObserver<BedsAvailableResponse> responseObserver) {
	      
		 String name = request.getName();
	     int number = request.getNumber();
	     
	     System.out.println("Accepeting client request -- Welcome " + name + ",There are " + number + " Beds available in the ward.");	
	      
	     String response_text = "";
	     BedsAvailableResponse response = BedsAvailableResponse.newBuilder().setMessage(response_text).build();
	      
	     //at this point I am sending the response to client as BedsAvailableResponse object
	     responseObserver.onNext(response);
	      
	     //inform about the completion of sending messages
	     responseObserver.onCompleted();
		
	    }


}
