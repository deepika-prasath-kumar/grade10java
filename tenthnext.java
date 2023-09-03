import java.util.*;
public class tenthnext
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        int ascii=(int)ch+10;
        System.out.println((char)ascii);
    }
}