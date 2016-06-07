package com.shanklish.AreaAndPerimeter;
import java.util.Scanner;


public class AreaAndPerimeter {

	public static void main(String[] args) 
	
	{
		Scanner scan = new Scanner(System.in);
		String choice = "";
		
			do
			{
			
				System.out.println("Please enter the name of the classroom you would like to measure: ");
				String classroom = scan.nextLine();
				
				System.out.println("Please enter the length of " + classroom);
				int input_length = scan.nextInt();
				
				System.out.println("Please enter the width of " + classroom);
				int input_width = scan.nextInt();				

				String garbage = scan.nextLine(); // catches the empty line thrown by nextInt()
				
				double area = getArea(input_length, input_width);
				double perimeter = getPerimeter(input_length, input_width);
				
				System.out.println("The Area of " + classroom + " is " + area + " and it's perimeter is " + perimeter +". Would you like to measure another classroom? (y/n)");
				choice = scan.nextLine();								
				
			} while(choice.equalsIgnoreCase("y"));
		
	}
	
		final static double getArea(double l, double w)
		{
			double area = l * w;
			return area;
		}
	
		final static double getPerimeter(double l, double w)
		{
			double perimeter = 2 * (l + w);
			return perimeter;
		}
}
