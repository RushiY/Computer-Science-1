package loops;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = key.nextInt();
        int num = 1;
        System.out.print(number + " has factors " );
        while(num <= number) {
            if (number % num == 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
