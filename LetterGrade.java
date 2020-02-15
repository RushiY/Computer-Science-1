import java.util.Scanner;
public class LetterGrade
{
    public static void main(String [] args)
    {
        Scanner hhs = new Scanner(System.in);

        System.out.print("Enter a Numerical Grade --> ");
        double grade = hhs.nextDouble();
        String response = "";
        if(grade >= 97)
        {
            response = "Letter Grade = A+";
            System.out.println(response);
        }
        else if(grade >= 94)
        {
            response = "Letter Grade = A";
            System.out.println(response);
        }
        else if(grade >= 90)
        {
            response = "Letter Grade = A-";
            System.out.println(response);
        }
        else if(grade >= 87)
        {
            response = "Letter Grade = B+";
            System.out.println(response);
        }
        else if(grade >= 84)
        {
            response = "Letter Grade = B";
            System.out.println(response);
        }
        else if(grade >= 80)
        {
            response = "B-";
            System.out.println(response);
        }
        else if(grade >= 77)
        {
            response = "C+";
            System.out.println(response);
        }
        else if(grade >= 74)
        {
            response = "C";
            System.out.println(response);
        }
        else if(grade >= 70)
        {
            response = "C-";
            System.out.println(response);
        }
        else
        {
            response = "F";
            System.out.println(response);
        }
    }
}