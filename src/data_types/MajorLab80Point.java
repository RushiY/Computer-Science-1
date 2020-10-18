package data_types;

public class MajorLab80Point {
	public static void main(String args[]) {
		System.out.println("TextLab02, 80 Point Version\n");

		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;

		int STARTING_SECONDS = 10000;

		int HOUR = STARTING_SECONDS / SECONDS_IN_HOUR; // 10000 / 3600

		int MINUTES_STEP_ONE = STARTING_SECONDS % SECONDS_IN_HOUR; // 10000 / 3600 (Remainder = 2800) Left over seconds

		int MINUTES_STEP_TWO = MINUTES_STEP_ONE / SECONDS_IN_MINUTE; // 2800 / 60 (46) Make the unit from seconds to
																		// minutes

		int SECONDS = MINUTES_STEP_ONE % SECONDS_IN_MINUTE; // 2800 / 60 (Remainder = 40) Remainder is seconds while the
															// division is minutes

		System.out.println("Starting seconds: " + STARTING_SECONDS);

		System.out.println("Hours: " + HOUR);

		System.out.println("Minutes: " + MINUTES_STEP_TWO);

		System.out.println("Seconds: " + SECONDS);
	}
}
