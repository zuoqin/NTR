echo build java classes using maven

call mvn compile

echo This is a shell script to run one server and one client

java -cp "./target/classes" com.ntr.core.Polygon 1.00001 0.0 -1.0 -1.0 -1.9 1.0 1.0 1.0 1.0 -1.0

rem echo script finish