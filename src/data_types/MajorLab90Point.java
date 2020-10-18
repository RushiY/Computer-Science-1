package data_types;

import java.util.Scanner; // declares there will be a scanner or user input in the code

public class MajorLab90Point {
	public static void main(String args[]) {
		Scanner lab = new Scanner(System.in);
		System.out.println("TextLab02, 90 Point Version\n");
		System.out.print("Please enter starting seconds--> ");
		int seconds = lab.nextInt(); // Where the user will input
		final int SECONDS_IN_HOUR = 3600; // final means it is a constant
		final int SECONDS_IN_MINUTE = 60;

		int HOUR = seconds / SECONDS_IN_HOUR; // 10000 / 3600

		int MINUTES_STEP_ONE = seconds % SECONDS_IN_HOUR; // 10000 / 3600 (Remainder = 2800) Left over seconds

		int MINUTES_STEP_TWO = MINUTES_STEP_ONE / SECONDS_IN_MINUTE; // 2800 / 60 (46) Make the unit from seconds to
																		// minutes

		int SECONDS = MINUTES_STEP_ONE % SECONDS_IN_MINUTE; // 2800 / 60 (Remainder = 40) Remainder is seconds while the
															// division is minutes

		System.out.println("Starting seconds: " + seconds);

		System.out.println("Hours: " + HOUR);

		System.out.println("Minutes: " + MINUTES_STEP_TWO);

		System.out.println("Seconds: " + SECONDS);
	}
}
