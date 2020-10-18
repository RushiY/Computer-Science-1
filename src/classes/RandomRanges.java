package classes;
public class RandomRanges
{
    public static void main(String [] args)
    {
      System.out.println("Random Ranges");   
      System.out.println("================");  
      int num1 = ((int)(Math.random()*26) + 0);
      int num2 = ((int)(Math.random()*3) + 1);
      int num3 = ((int)(Math.random()*51) + 50);
      int num4 = ((int)(Math.random()*-8) - 1);
      int num5 = ((int)(Math.random()*201) - 100);
      int num6 = ((int)(Math.random()*26) + 65);
      int num7 = ((int)(Math.random()*1000) + 0);
      double num7c = num7 / 1000.0;
      int num8 = ((int)(Math.random()*9001) + 1000);

      System.out.println("1. Range: 0 to 25 = " + num1);
      System.out.println("2. Range: 1 to 3 = " + num2);
      System.out.println("3. Range: 50 to 100 = " + num3);
      System.out.println("4. Range: -1 to -10 = " + num4);
      System.out.println("5. Range: -100 to 100 = " + num5);
      System.out.println("6. Range: A to Z = " + (char)num6);
      System.out.println("7. Range: 0.1 to 1 = " + num7c);
      System.out.println("8. Range: 1000 to 10000 = " + num8);
    }
}
