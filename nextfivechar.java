import java.util.*;
public class nextfivechar
{
    public static void main(String[]argS)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        int ascii=(int)ch;
        for(int i=1;i<=5;i++)
        {
            int result=ascii+i;
            System.out.println((char)result);
        }
    }
}