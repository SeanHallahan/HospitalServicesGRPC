# Create a virtual environment

virtualenv crypto

# For those in Windows

prices/Scripts/activate
pip install grpcio grpcio-tools

# For those in Linux and MacOS

source prices/bin/activate 
pip3 install grpcio grpcio-tools

#Run this command to compile with proto and python, this command will create two neccesary files, prices_service.pb2.py and prices_service_pb2_grpc.py
python3 -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. crypto_service.proto