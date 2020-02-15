import java.util.Scanner;
public class Square 
{
    public static void main(String [] args)
    {
    Scanner key = new Scanner(System.in);
    System.out.print("Enter a word --> ");
    String word = key.nextLine();
    System.out.println("\n" + word);
    String width = "";
    for(int i = 1; i < word.length()-1;i++)
    {
        width += " ";  
        
    }
    
    for(int i = 0; i <= word.length()-1;i++)
    {
        System.out.println("" + word.substring(i,(i+1)) + width + word.charAt((word.length()-1)-i));
        
    }
    System.out.println(word);
}
}