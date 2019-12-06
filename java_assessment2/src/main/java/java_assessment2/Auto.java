package java_assessment2;

import java.text.DecimalFormat;
import java.util.Random;

public class Auto {

	static String[] compass = { "North", "East", "South", "West" };

	// Generating random numbers between 0 and 3 to use as index values
	static Random rand = new Random();
	static int i = rand.nextInt(4);
	static int j = rand.nextInt(4);
	
	// Getting a direction from the compass array using the random num generated above
	static String direction = compass[i];
	static String direction2 = compass[j];
	
	//To format the numbers
	static DecimalFormat df = new DecimalFormat("#.##");

	// Getting a random num for direction
	static double x = 5 * Math.random();

	static String xDist = df.format(x);

	static double y = 5 * Math.random();

	static String yDist = df.format(y);

	
	static double hypo = Math.hypot(x, y);

	static String distTravelled = df.format(hypo);

}
