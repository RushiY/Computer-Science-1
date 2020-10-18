package functions;
public class DashedWord
{
    public void VoidDW(String word)
    {
        String wordDashed = "";
        int a = 0;
        for(int i = 1; i <= word.length(); i++)
        {
            wordDashed = wordDashed + word.substring(a,i);
            wordDashed += "-";
            a++;
        }
        System.out.println(wordDashed.substring(0, wordDashed.length()-1));
    }
    
    public String ReturnDW(String word)
    {
        String wordDashed = "";
        int a = 0;
        for(int i = 1; i <= word.length(); i++)
        {
            wordDashed = wordDashed + word.substring(a,i);
            wordDashed += "-";
            a++;
        }
        String wordD = wordDashed.substring(0, wordDashed.length()-1);
        return wordD;
    }
}