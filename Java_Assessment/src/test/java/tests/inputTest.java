package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Input;

public class inputTest {

	@Test
	public void getInputTest() {

		Input getInput = new Input();
		int choiceNorth = Input.getPlayerInput();
		int choiceEast = Input.getPlayerInput();
		int choiceSouth = Input.getPlayerInput();
		int choiceWest = Input.getPlayerInput();
		assertEquals(1, choiceNorth);
		assertEquals(2, choiceEast);
		assertEquals(3, choiceSouth);
		assertEquals(4, choiceWest);

	}

}
