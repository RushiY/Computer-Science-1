package objects;
public class SuperHeros
{
    private String heroName;
    private String age;
    private String power;
    private String realName;
    private String weakness;
    private String secretProfile;
   
    public SuperHeros (String hn, String a, String p, String rn, String w, String pr)
    {
        heroName = hn;
        age = a;
        power = p;
        realName = rn;
        weakness = w;
        secretProfile = pr;
    }
   
    public String toString()
    {
        if(secretProfile.equalsIgnoreCase("y"))
        {
            return "\nSuper Hero Profile" + "\n" +
               "==================" + "\n" +
               "Name: " + heroName + "\n" +
               "Age: " + age + "\n" +
               "Power: " + power + "\n\n" +
               "***Secret Info***" + "\n" +
               "Real Name: " + realName + "\n" +
               "Hero's Weakness: " + weakness + "\n";
        }
        else
        {
               return "\nSuper Hero Profile" + "\n" +
               "==================" + "\n" +
               "Name: " + heroName + "\n" +
               "Age: " + age + "\n" +
               "Power: " + power;
        }
    }
}
