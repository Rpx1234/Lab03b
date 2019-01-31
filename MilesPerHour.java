//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
 private int distance, hours, minutes;
 private double mph;
 private double time;
 public MilesPerHour()
 {
  setNums(0,0,0);
  mph=0.0;
 }

 public MilesPerHour(int dist, int hrs, int mins)
 {
   distance = dist;
   hours = hrs;
   minutes = mins;
 }

 public void setNums(int dist, int hrs, int mins)
 {
   distance = dist;
   hours = hrs;
   minutes = mins;
   
 }

 public void calcMPH()
 {
   time = ((double)hours+((double)minutes/60.0));
   mph = (distance / time); 
  

 }

 public void print()
 {
  out.print(distance +" miles in " + hours +" hour and " + minutes+ " minutes" + " = " );
  System.out.printf("%.0f", mph);
  out.print(" MPH.");
 }
}