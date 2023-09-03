import java.util.*;
public class intials
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name with 3 words");
        String sentence=sc.nextLine();
        sentence=sentence.trim();
        int l=sentence.length();
        char a=sentence.charAt(0);
        System.out.print(a+" ");
        char ch=' ';
        char m=' ';
        for(int i=0;i<l;i++)
        {
           ch=sentence.charAt(i);
           if(ch==' '){
             m=sentence.charAt(i+1);
             System.out.print(m+" ");
           }
        }
    }
}