import java.lang.Math;

public class Exercise_01_05 {

	

	public static void main(final String[] args) {
		System.out.println(calculatePi(15));
	}

	// Task: create your own function signature to solve the task

	 public static double calculatePi(int denominator)
			 {
				double pi = 1;
				int count = 1; // alternating adding or subtracting
				for (int i = 3 ; i <= denominator ; i+=2)
				{
					pi += Math.pow(-1, count)* (1.0 / i); // adds for even count and subtracts for odd count
					count++;
				}
				
				return (4 * pi);
			 }
	
}

