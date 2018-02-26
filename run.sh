#!/bin/bash  
echo "build java classes using maven"
mvn compile
echo "This is a shell script to run one server and one client"  
java -cp "./target/classes" Player 1 1  
echo "script finish"
