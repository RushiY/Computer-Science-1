package objects;
import java.util.*;

public class AssignmentManager
{  
   public static void main(String[] args)
   {
       Assignment ass = new Assignment();
       System.out.println("/**************************************/");
       System.out.println("/*     Test Default Constructor       */");
       System.out.println("/*     and Accessor methods           */");
       System.out.println("/**************************************/");
       System.out.println("Type         : " + ass.getType());
       System.out.println("Name         : " + ass.getName());
       System.out.println("Score        : " + ass.getScore());
       System.out.println("Letter Grade : " + ass.toString());
       
       Assignment as = new Assignment("Chapter 1 Test", "Test", 95);
       System.out.println("\n/**************************************/");
       System.out.println("/*     Test 2nd Constructor           */");
       System.out.println("/*     and Accessor methods           */");
       System.out.println("/**************************************/");
       System.out.println("Type         : " + as.getType());
       System.out.println("Name         : " + as.getName());
       System.out.println("Score        : " + as.getScore());
       System.out.println("Letter Grade : " + as.toString());
       
       Assignment a = new Assignment("Chapter 1 Quiz", "Quiz", 83);
       System.out.println("\nType         : " + a.getType());
       System.out.println("Name         : " + a.getName());
       System.out.println("Score        : " + a.getScore());
       System.out.println("Letter Grade : " + a.toString());
       
       Assignment s = new Assignment();
       s.Name("Chapter 1 Test");
       s.Type("Test");
       s.Score(75);
       System.out.println("\n/**************************************/");
       System.out.println("/*     Test Mutator Methods           */");
       System.out.println("/*     and Accessor methods           */");
       System.out.println("/**************************************/");
       System.out.println("Type         : " + s.getType());
       System.out.println("Name         : " + s.getName());
       System.out.println("Score        : " + s.getScore());
       System.out.println("Letter Grade : " + s.toString());
       
       Assignment b = new Assignment();
       b.Name("Chapter 1 Quiz");
       b.Type("Quiz");
       b.Score(30);
       System.out.println("\nType         : " + b.getType());
       System.out.println("Name         : " + b.getName());
       System.out.println("Score        : " + b.getScore());
       System.out.println("Letter Grade : " + b.toString());
   }    
}
