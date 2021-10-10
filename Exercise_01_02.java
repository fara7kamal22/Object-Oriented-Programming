import java.text.DecimalFormat;

public class Exercise_01_02 
	{
		static DecimalFormat df14 = new DecimalFormat("0.00000000000000");

		public static void main(final String[] args) 
			{
				// Do something here to solve the task
				double pi = 4 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13) - (1.0/15));
				System.out.println(df14.format(pi));
			}

	}

