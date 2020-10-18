package objects;
public class Assignment
{
   // instance variables
   
   private String name;
   private String type;
   private int score;
   
   // constructors
   
   public Assignment(String n, String t, int s)
   {
       name = n;
       type = t;
       score = s;
   }
   
   public Assignment()
   {
       name = "";
       type = "";
       score = 0;
   }
   
   // accessor methods
   
   public String getName()
   {
       return name;
   }
   
   public String getType()
   {
       return type;
   }
   
   public int getScore()
   {
       return score;
   }
   
   // mutator methods
   
   public void Name(String n)
   {
       name = n;
   }
   
   public void Type(String t)
   {
       type = t;
   }
   
   public void Score(int s)
   {
       score = s;
   }
   
   // other methods
   
   public String toString()
   {
       if(score >= 90)
       {
           return "A";
       }
       else if(score >= 80)
       {
           return "B";
       }
       else if(score >= 70)
       {
           return "C";
       }
       else if(score >= 60)
       {
           return "D";
       }
       else
       {
           return "F";
       }
    }
}