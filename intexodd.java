import java.util.*;
public class intexodd
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        String res="";
        
        for(int i=1;i<=10;i++)
        {
            int n=sc.nextInt();
            if(n%2!=0)
            {
               res=res+Integer.toString(n); 
            }
        }
        System.out.println(res);
    }
}