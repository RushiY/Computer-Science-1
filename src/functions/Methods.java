package functions;
public class Methods
{
    //  square Method
   
    public int square(int num)
    {
        num = (int) Math.pow(num,2.0);
        return num;
    }

    //  sumThree Method
   
    public int sumThree(int num1, int num2, int num3)
    {
        int sum = num1 + num2 + num3;
        return sum;
    }
   
    //  average Method
   
    public double average(double num1, double num2)
    {
        double avg = (num1 + num2) /2;
        return avg;
    }

    //  smaller Method
   
    public int smaller(int num1, int num2)
    {
        int less = Math.min(num1, num2);
        return less;
    }

    //  randomInt Method
   
    public int randomInt(int num1)
    {
        int random = (int)(Math.random()*num1) + 1;
        return random;
    }

    //  evenOdd Method

    public String evenOdd(int num1)
    {
        String even = "even";
        String odd = "odd";
        if(num1 % 2 == 0)
        {
            return even;
        }
        else
        {
            return odd;
        }
    }

    //  getLetterGrade Method

    public String getLetterGrade(int num1)
    {
        if(num1 >= 90)
        {
            return "A";
        }
        else if(num1 >= 80)
        {
            return "B";
        }
        else if(num1 >= 70)
        {
            return "C";
        }
        else
        {
            return "F";
        }
       
    }

    //  greeting Method

    public void greeting(String word1)
    {
        System.out.println(word1 + ", have a nice day!");
    }

    // firstLetter Method

    public String firstLetter(String letter)
    {
        return letter.substring(0,1);
    }
   
    //  lastLetter Method
    public String lastLetter(String letter)
    {
        return letter.substring(letter.length()-1, letter.length());
    }

    //  removeFirst Method

    public String removeFirst(String letter)
    {
        return letter.substring(1,letter.length());
    }

    //  removeLast Method

    public String removeLast(String letter)
    {
        return letter.substring(0,letter.length()-1);
    }

    //  merge Method

    public String merge(String one, String two, String three)
    {
        return one + two + three;
    }

    //  repeatFirst Method

    public String repeatFirst(String str)
    {
        str = firstLetter(str);
        str = merge(str,str,str);
        return str;
    }

    //  repeatLast Method

    public String repeatLast(String str)
    {
        str = lastLetter(str);
        str = merge(str,str,str);
        return str;
    }
}
