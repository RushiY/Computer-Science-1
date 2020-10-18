package data_types;

import java.util.Scanner; // Tells the IDE that there will be a user input ( Integrated Development Environment)

public class MajorLab100Point {
	public static void main(String args[]) {
		Scanner lab = new Scanner(System.in);

		System.out.println("TextLab02, 100 Point Version\n");
		System.out.print("Please enter starting seconds--> ");
		int milliseconds = lab.nextInt();
		System.out.println("Starting milliseconds: " + milliseconds);
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;
		final int MILLISECONDS_IN_HOUR = 3600000;
		final int MILLISECONDS_IN_MINUTE = 60000;
		final int MILLISECONDS_IN_SECOND = 1000;

		int hours = milliseconds / MILLISECONDS_IN_HOUR; // User input of milliseconds / 3600000
		int minutes_one = milliseconds % MILLISECONDS_IN_HOUR; // User input / 3600000 (Remainder = minutes in
																// milliseconds
		int minutes_two = minutes_one / MILLISECONDS_IN_MINUTE; // Minutes in milliseconds / milliseconds in minute to
																// have units in seconds for minute
		int seconds_one = milliseconds / MILLISECONDS_IN_MINUTE; // User input in milliseconds / 60000(milliseconds)
		int seconds_two = milliseconds % MILLISECONDS_IN_MINUTE; // User input in milliseconds / 60000 and the remainder
																	// is in the milliseconds unit for minute(Represents
																	// minutes)
		int seconds_three = seconds_two / MILLISECONDS_IN_SECOND; // Remainder in milliseconds / 1000 to convert unit
																	// into seconds
		int milliseconds1 = milliseconds % MILLISECONDS_IN_SECOND; // User input / milliseconds in a second to get the
																	// second, but the remainder is the milliseconds

		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes_two);
		System.out.println("Seconds: " + seconds_three);
		System.out.println("Milli Seconds: " + milliseconds1);
	}
}
