// This Java application calculates commmission earned for products sold in the price range of 10,000.0 - 100,000.0 with an 0.08 - 0.12 percent commission rate.

import java.util.Scanner;

public class CommApp {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        
System.out.printf("%-15s%-15s\n","Sales Amount", "Commission");
for (int i = 10000; i <= 100000; i += 5000) {

System.out.printf("%-15d%-15.2f\n", i, computeCommission(i)); }}
 
 public static double computeCommission(double salesAmount) {
 
 double commission;
 if (salesAmount > 10000) {
   commission = (5000 * 0.08) + (5000 * 0.1) + (salesAmount - 10000)
     * 0.12;
  } 
  
  else if (salesAmount > 5000) {
   commission = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
  } 
  
  else {
   commission = salesAmount * 0.08;
  }
  return commission;
 }
 
}
