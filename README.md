# pangaea-assessment


Build the project using mvn clean package

Run the project using java -jar pangaea-assessment-0.0.1-SNAPSHOT.jar

#To publish to a Topic

curl -X POST "http://localhost:8080/publish/topic1" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"url\": \"www.google.com\"}"

#To Subscribe to a Topic

curl -X POST "http://localhost:8080/subscribe/topic1" -H "accept: */*"
