import java.util.*;
public class asciirev
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        int ascii=(int)ch;
        int s1=0; 
        int rev=0;
        while(ascii!=0)
        {
            s1=ascii%10;
            rev=(rev*10)+s1;
            ascii=ascii/10;
        }
        System.out.println((char)rev);
    }
}