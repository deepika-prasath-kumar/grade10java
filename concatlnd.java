import java.util.*;
public class concatlnd
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 characters");
        String res="";
        for(int i=1;i<=10;i++)
        {
           char ch=sc.next().charAt(0);
           if(Character.isLetterOrDigit(ch)==true)
           {
               res=res+ch;
           }
        }
        System.out.println(res);
    }
}