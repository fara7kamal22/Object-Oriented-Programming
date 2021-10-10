import java.lang.Math;
import java.util.*;

public class Exercise_01_04 {

	
	
	public static void main(final String[] args) 
	{
		System.out.print("Input a diameter: ");
		Scanner scanner = new Scanner(System.in);
		double diameter = scanner.nextDouble();
		
		System.out.println(calculatePerimeter(diameter));
	}

	// Task: create your own function signature to solve the task

	 public static double calculatePerimeter(double diameter)
		 {
			 if (diameter < 0)
				 return 0;
			 else
				 return (Math.PI * diameter);
		 }
	
}

