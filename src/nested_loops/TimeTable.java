package nested_loops;
public class TimeTable
{
    public static void main(String [] args)
    {
        int c = 1;
        int num = 10;
        int s = 1;
        for(int k = 1; k <= num; k = k+c)
        {
            for(int i = k; i <= k*10;i = i + k)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}