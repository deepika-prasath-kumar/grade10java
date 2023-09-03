import java.util.*;
public class tentohundred
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=10;i<=100;i++)
        {
            int count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
        }
    }
}