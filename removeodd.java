import java.util.*;
public class removeodd
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to remove odd digits from");
        int n=sc.nextInt();
        int d=0;
        String res="";
        while(n!=0)
        {
            d=n%10;
            if(n%2==0)
            {
               res=res+Integer.toString(d); 
            }
            n=n/10;
        }
        System.out.println(res);
    }
}