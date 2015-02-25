package passerRating;

import java.util.Scanner;

public class computePasserRating {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		
		input = new Scanner(System.in);
		
		//Get input
		System.out.print("How many touchdowns did this quarterback throw?");
		double touchdowns = input.nextDouble();
		
		System.out.print("How many yards did this quarterback throw for?");
		double yards = input.nextDouble();
		
		System.out.print("How many interceptions did this quarterback throw?");
		double interceptions = input.nextDouble();
		
		System.out.print("How many completions did this quarterback throw?");
		double completions = input.nextDouble();
		
		System.out.print("How many passing attempts did this quarterback have?");
		double attempts = input.nextDouble();
		
		//Calculations for passer rating
		double a = ((completions/attempts) -0.3) *5.0;
		double b = ((yards/attempts) -3.0)*0.25;
		double c = (touchdowns/attempts)*20.0;
		double d = 2.375 - ((interceptions/attempts)*25.0);
		
		//ensure values are within acceptable range
		if (a > 2.375)
			a = 2.375;
		else if (a < 0)
			a = 0;
		
		if (b > 2.375)
			b = 2.375;
		else if (b < 0)
			b = 0;
		
		if (c > 2.375)
			c = 2.375;
		else if (c < 0)
			c = 0;
		
		if (d > 2.375)
			d = 2.375;
		else if (d < 0)
			d = 0;
		
		//Final calculation
		double passerRating = ((a + b + c +d)/6) * 100;
		
		//Print
		System.out.printf("The passer rating for this quarterback is %4.1f", passerRating);
		
		
	}

}
