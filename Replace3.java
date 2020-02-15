import java.util.Scanner;
public class Replace3
{
  public static void main(String [] args)
  {
      System.out.print("Enter a string --> ");
      Scanner text = new Scanner(System.in);
      String word = text.nextLine();
      
      int find1 = word.indexOf("a");
      String word2 = word.substring(find1 +1);
      int find2 = word2.indexOf("A");
      
      
      
      System.out.println(word.substring(0,find1) + "*" + word2.substring(0,find2) + "*" + word2.substring(find2 + 1));
  }
}