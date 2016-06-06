package com.Shanklish.AreaAndPerimeter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaAndPerimeter 
{
	public static void main(String [] args)
	{
		
		Scanner scan = new Scanner(System.in);
		String choice = "";
		
		try
		{
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
				double perimeter = getPerimeter(input_length, input_width); // Calling both methods to measure Area and Perimeter
				
				System.out.println("Would you like check the volume of the classroom? (yes/no)");
				String volumeOption = scan.nextLine();
				
									
				double input_Height = 0;
				
						
					if (volumeOption.equalsIgnoreCase("yes"))  // If user wants to measure volume
					{
						System.out.println("Please enter the height of the classroom");
						input_Height = scan.nextDouble();
						
						garbage = scan.nextLine(); // catches the empty line thrown by nextInt()
						
						double volume = getVolume(input_length, input_width, input_Height);
						
						System.out.println("The Area of " +  classroom + " is " + area + ", it's perimeter is " + perimeter + " and it's volume is " + volume);																							
					}
					
					else
					{
						System.out.println("The Area of " + classroom + " is " + area + " and it's perimeter is " + perimeter);
					}	
					
					
					System.out.println(" Would you like to measure another classroom? (y/n)"); // initiates a new loop
					choice = scan.nextLine();
					
					
			} while(choice.equalsIgnoreCase("y"));
		}
		
			catch(InputMismatchException a) // Handles incorrect data input
			{
				System.out.println("Please enter the correct data type");
			}
	}
			
	
		final static double getArea(double l, double w) // Calculates the Area
		{
			double area = l * w;
			return area;
		}
	
		final static double getPerimeter(double l, double w) // Calculate the Perimeter
		{
			double perimeter = 2 * (l + w);
			return perimeter;
		}
		
		final static double getVolume(double l, double w, double h) // Calculates the Volume
		{
			double volume = l * w * h;
			return volume;
		}
}
