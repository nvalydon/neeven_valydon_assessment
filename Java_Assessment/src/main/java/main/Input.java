package main;

import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Input {

	public static int getPlayerInput() {
		int choice;

		while (true) {
			System.out.println("Select 1,2, 3 or 4  for North, East, South or West");

			Scanner in = new Scanner(System.in);

			choice = in.nextInt();

			if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
				switch (choice) {

				case 1:
					System.out.println("Player chooses : North");
					return choice;
				case 2:
					System.out.println("Players chooses : East ");
					return choice;

				case 3:
					System.out.println("Players chooses : South");
					return choice;

				case 4:
					System.out.println("Players chooses : West");
					return choice;

				}

			}
			
		}

	}
	
	static DecimalFormat df = new DecimalFormat("#.##");

	static double x = 5 * Math.random();

	static String xDist = df.format(x);

	static double y = 5 * Math.random();

	static String yDist = df.format(y);

	static double hypo = Math.hypot(x, y);

	static String distTravelled = df.format(hypo);


	
	
	
}
