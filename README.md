To build & run:
./run.cmd

To run:
java -cp "./target/classes" Polygon 0.1 0.1 -1.0 -1.0 -1.9 1.0 1.0 1.0 1.0 -1.0
where first two doubles are X and Y coordinates of the point and the rest consequent X and Y coordinates of polygon vertices:
java -cp "./target/classes" Polygon X0 Y0 X1 Y1 X2 Y2 .. .. XN YN

To test:
mvn clean test

