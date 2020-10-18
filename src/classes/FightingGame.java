package classes;
public class FightingGame {
	public static void main(String[] args) {
		int hit1 = (int) (Math.random() * 21);
		int hit2 = (int) (Math.random() * 21);
		int hit3 = (int) (Math.random() * 21);
		int hit4 = (int) (Math.random() * 21);
		int hit5 = (int) (Math.random() * 21);
		int hit6 = (int) (Math.random() * 21);
		int max1 = (int) (Math.max(hit1, hit2));
		int max2 = (int) (Math.max(max1, hit3));
		int max3 = (int) (Math.max(max2, hit4));
		int max4 = (int) (Math.max(max3, hit5));
		int max5 = (int) (Math.max(max4, hit6));
		int min1 = (int) (Math.min(hit1, hit2));
		int min2 = (int) (Math.min(min1, hit3));
		int min3 = (int) (Math.min(min2, hit4));
		int min4 = (int) (Math.min(min3, hit5));
		int min5 = (int) (Math.min(min4, hit6));
		double avg = (hit1 + hit2 + hit3 + hit4 + hit5 + hit6) / (double) 6;
		double avg1 = (double) (Math.round(avg));
		int experience = (int) (Math.random() * 126) + 5;
		System.out.println(
				"You open the chamber door to see what lies beyond. \nA demogorgon jumps out and attacks! \nYou deftly pull out your mightly blade and defend yourself:\n");

		System.out.println("You hit the demogorgan for " + hit1 + " points of damage.");
		System.out.println("You hit the demogorgan for " + hit2 + " points of damage.");
		System.out.println("You hit the demogorgan for " + hit3 + " points of damage.");
		System.out.println("You hit the demogorgan for " + hit4 + " points of damage.");
		System.out.println("You hit the demogorgan for " + hit5 + " points of damage.");
		System.out.println("You hit the demogorgan for " + hit6 + " points of damage.\n");

		System.out.println("The demogorgon falls to the floor, lifeless.\nCongratulations! You earned " + experience
				+ " of experience.\n");

		System.out.println("Battle Summary\n==============");
		System.out.println("Max hit: " + max5);
		System.out.println("Min hit: " + min5);
		System.out.println("Hit average: " + (int) avg1);
	}
}
