# aws-lambda-hello-world
To demonstrate a simple hello world application which is compatible to run in AWS Lambda

# Prerequisites
1. [x] Java 17
2. [x] Maven
3. [x] AWS Account to create Lambda function

# How to Install
run `mvn clean package`

# Steps to deploy the Application
1. [x] Create Lambda function in AWS with any name
2. [x] Select the Runtime as `Java 17`
3. [x] Upload the uber jar file which should be under the `target` folder into the code section of the AWS Lambda
4. [x] Configure the invoke method `io.vels.HelloWorldLambda::helloWorld` in the Runtime settings section of the AWS Lambda