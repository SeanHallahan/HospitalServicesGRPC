package com.proto.patients;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import com.proto.patients.CalculateRequest.Operation;
import com.proto.patients.PatientsServiceGrpc.PatientsServiceImplBase;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//This class will serve both as a server for my service
//and also for implementing the service behavior - methods.

public class PatientsServer extends PatientsServiceImplBase {

	public static void main(String[] args) {
		
		PatientsServer patientsservice = new PatientsServer();
		
		int port = 50051;
		
		try {
			Server server = ServerBuilder.forPort(port)
				.addService(patientsservice)
				.build()
				.start();
			
			System.out.println("Patient Server Started listening on " + port);
			
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
	
	@Override
	public void calculate(CalculateRequest request, StreamObserver<CalculateResponse> responseObserver) {
		
		float value = Float.NaN;
		String msg ="";
		
		if(request.getOperation()==Operation.ADDITION) {
			
			value = request.getNumber1() + request.getNumber2();
			
			msg = "addition - success";
		}
		if(	request.getOperation()==Operation.ADDITION)
			value = request.getNumber1() + request.getNumber2();
		else if(	request.getOperation()==Operation.SUBTRACTION)
			value = request.getNumber1() - request.getNumber2();
		else if(	request.getOperation()==Operation.MULTIPLICATION)
			value = request.getNumber1() * request.getNumber2();
		else if(	request.getOperation()==Operation.DIVISION)
			value = request.getNumber1() / request.getNumber2();
		else {
			value = Float.NaN;
			msg = "no supported/implemented operation";
		}
		
		
		CalculateResponse reply = CalculateResponse.newBuilder()
				.setResult(0)
				.setMessage(msg)
				.build();
		
		//here we are returning the message.
		responseObserver.onNext(null);
		
		responseObserver.onCompleted();
		
	}
	
	public void generateRandomNumbers(RandomRequest request,
			StreamObserver<NumberResponse> responseObserver) {


		System.out.printf("receiving generateRandom method num: %d from: %d to: %d \n",
				request.getNumbers(), request.getMin(), request.getMax()  );

		Random rand = new Random();

		for(int i=0; i<request.getNumbers(); i++) {

			int random_value = rand.nextInt(request.getMax() - request.getMin()) + request.getMin() + 1;

			NumberResponse reply = NumberResponse.newBuilder().setNumber(random_value).build();

			responseObserver.onNext(reply);

			try {
				//wait for a second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		responseObserver.onCompleted();


	}
	
	public StreamObserver<NumberMessage> averageValues(
			StreamObserver<CalculateResponse> responseObserver) {


		return new StreamObserver<NumberMessage>() {

			ArrayList<Float> list = new ArrayList();

			@Override
			public void onNext(NumberMessage request) {

				System.out.println("receiving average number of patients per month: "+ request.getNumber()  );

				list.add(request.getNumber());		           

			}

			@Override
			public void onError(Throwable t) {

			}

			@Override
			public void onCompleted() {
				System.out.printf("receiving final average number of patients per month \n" );

				// System.out.println("mean "+ list.size());

				double temp = 0;	
				for(float v:  list) {
					temp = temp + v;
				}
				float mean = (float) (temp/list.size());

				CalculateResponse reply = CalculateResponse.newBuilder().setResult(mean).build();

				// System.out.println("mean "+ mean);
				responseObserver.onNext(reply);

				responseObserver.onCompleted();

			}

		};

	}
	
public StreamObserver<ConvertMessage> convertBase(StreamObserver<ConvertResponse> responseObserver) {
		
		return new StreamObserver<ConvertMessage> () {

			@Override
			public void onNext(ConvertMessage msg) {
				System.out.println("receiving convertBase method num: "+ msg.getNumber() + " from-base: "+ msg.getFromBase() + " to-base: "+ msg.getToBase()  );
				
				String converted =  Integer.toString(Integer.parseInt(msg.getNumber(), msg.getFromBase()), msg.getToBase());
				
				ConvertResponse reply = ConvertResponse.newBuilder().setNumber(converted).setBase(msg.getToBase()).build();
				
				responseObserver.onNext(reply);
				
			}

			@Override
			public void onError(Throwable t) {
				
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				System.out.println("receiving convertBase completed ");
				
				//completed too
				responseObserver.onCompleted();
			}
			
		};
	}

		
	
	
}


