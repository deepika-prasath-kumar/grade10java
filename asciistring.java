import java.util.*;
public class asciistring
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String sentence=sc.nextLine();
        int l=sentence.length();
        int ascii=0;
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            ascii=(int)ch;
            System.out.println("The ascii value of character " + ch+"  is "+ascii); 
        }
    }
}