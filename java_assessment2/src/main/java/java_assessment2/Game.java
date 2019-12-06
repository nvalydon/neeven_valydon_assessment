package java_assessment2;

public class Game extends Auto {

	public static void start() {

		System.out.println("You wake up in a cold and foggy swamp, with only the moon for light. \r\n"
				+ "You have no idea where you are suppose to go.\r\n"
				+ "In the corner of your eye you see a small object in the mud that glistens in the moonlight.\r\n"
				+ "You go to pick it up, it appears to be a compass...");

		System.out.println();

		System.out.println("The compass speaks to you... " + "Travel " + xDist + "m " + direction);
		System.out.println("");
		System.out.println("After reaching your destination you decide to consult the compass once more...");
		System.out.println(" ");

		System.out.println(" ");
		System.out.println("The compass speaks to you... " + "Travel " + yDist + "m " + direction2);
		System.out.println(" ");
		System.out.println("The fog disappates and reveals a treasure chest! Congratulations! You win!!");

		System.out.println("You have travelled " + distTravelled + "m " + "from the start point");

	}
}
