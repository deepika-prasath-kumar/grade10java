import java.util.*;
public class perfnosbet
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int m=sc.nextInt();
        System.out.println("Enter the second number");
        int n=sc.nextInt();
        if(m<n)
        {
            for(int i=m;i<=n;i++)
            {
              int sum=0;
              for(int j=1;j<i;j++)
              {
                  if(i%j==0)
                  {
                      sum=sum+i;
                  }
              }
              if(sum==i)
              {
                  System.out.println(i);
              }
            }
        }
        else{
            System.out.println("Please enter a valid range");
        }
    }
}