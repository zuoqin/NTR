package com.ntr.core;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;


import org.junit.Test;

public class PolygonTest {


	@Test
	public void calc_triangleArea() {
		double[] triangle = {0.0, 0.0, 0.0, 1.0, 1.0, 0.0};
		assertEquals(Polygon.polygonArea(triangle), 0.5,0.000001);
	}


	@Test
	public void calc_squareArea() {
		double[] square = {-1.0, -1.0, -1.0, 1.0, 1.0, 1.0, 1.0, -1.0};
		assertEquals(Polygon.polygonArea(square), 4.0,0.000001);
	}


	@Test
	public void find_pointinsquareArea() {
		double[] square = {-1.0, -1.0, -1.0, 1.0, 1.0, 1.0, 1.0, -1.0};
		assertEquals(Polygon.isdotinsidepolygon(0.0, 0.0, square), true);
	}

	@Test
	public void find_pointoutsquareArea() {
		double[] square = {-1.0, -1.0, -1.0, 1.0, 1.0, 1.0, 1.0, -1.0};
		assertEquals(Polygon.isdotinsidepolygon(2.0, 0.0, square), false);
	}
}