package com.ntr.core;

import java.net.*;
import java.io.*;

public class Polygon
{ 
   public Polygon()
   {
   	
   }

  public static double polygonArea(double[] polygon) 
  { 
    double s = 0.0;
    int j = polygon.length-2;

    for (int i=0; i<polygon.length; i+= 2)
    {
      s += (polygon[j]+polygon[i]) * (polygon[j+1]-polygon[i+1]); 
      j = i;    
    }
    s = Math.abs(s/2.0);
    
    return s;
   }

   public static double trianglesquare( double a, double b, double c, double d, double e, double f){
       return Math.abs(  (a-c) * (b-f) - (b-d) * (a-e) ) / 2.0;
   }

   public static boolean isdotinsidepolygon(double a, double b, double [] polygon)
   {
       double s = 0.0;
       double c = polygon [0];
       double d = polygon [1];

       for(int i=2; i<polygon.length + 2; i+= 2){

           double e = i >= polygon.length ? polygon[0] : polygon[i];
           double f = i >= polygon.length ? polygon[1] : polygon[i + 1];
           s = s + trianglesquare( a, b, c, d, e, f);        
           c = e;
           d = f;
       }
       
       if(Math.abs(s / polygonArea(polygon) - 1) > 0.0000000001){
         return false;
       }
       else{
         return true;
       }
   }

   public static void main(String args[])
   {
      double[] polygon = new double[args.length - 2];
      for (int i = 0; i < polygon.length; i++) {
          polygon[i] = Double.parseDouble(args[i + 2]);
      }
      if(isdotinsidepolygon(Double.parseDouble(args[0]), Double.parseDouble(args[1]),  polygon)){
         System.out.print("Point inside polygon");
      }
      else{
         System.out.print("Point outside polygon");
      }
   }
}
