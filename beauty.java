package javaprojects;
import java.util.*;


/* total sales occur in the range 
  (0 - 5000.00)
  (5000.01-10000.00)
  (above  10000.01)   */



/* commission is based on the total sales*/



public class beauty {
	public static void main(String[]args) {
		
		double comm=0.00, sale = 0.00;
		int rate = 0;
	
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sales ");
		sale=sc.nextDouble();
		
		
		if(sale<=5000.00)
		{
			
			
			
			rate=2;
			comm= sale*0.02;
			
		}
		if(sale>= 5000.01 && sale<=10000.00)
			
			
			
		{
			
			rate=5;
			comm=sale*0.05;
			
		}
		if(sale>10000.00)
		{
			rate=8;
			comm=sale*0.08;
			
			
		}
		System.out.println("Commission amount = "+ comm);
		System.out.println("Commmission rate:" + rate  );
	}

}
