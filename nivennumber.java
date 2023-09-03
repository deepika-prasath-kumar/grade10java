import java.util.*;
public class nivennumber
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is niven or not");
        int n=sc.nextInt();
        int p=n;
        int n1=0;
        int sum=0;
        while(n!=0)
        {
          n1=n%10;
          n=n/10;
          sum=sum+n1;
        }
        if(p%sum==0)
        {
           System.out.println("The number is Niven"); 
        }
        else{
            System.out.println("The number is not Niven");
        }
    }
}