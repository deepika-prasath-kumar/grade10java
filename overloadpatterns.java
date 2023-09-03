import java.util.*;
public class overloadpatterns
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character who's ascii number you want to find");
        char a=sc.next().charAt(0);
        System.out.println("Enter the number of letters to print in the pattern");
        int b=sc.nextInt();
        System.out.println("Enter the 2 strings to find number of a's");
        String c=sc.next();
        String d=sc.next();
        pattern(a);
        pattern(b);
        pattern(c,d);
    }
    static void pattern(char ch)
    {
        int ascii=(int)ch;
        System.out.println(ascii*ascii);
    }
    static char pattern(int n)
    {
        char ch=' ';
        for(int i=1;i<=n;i++)
        {
            ch='a';
            for(int j=1;j<=i;j++)
            {
              System.out.print(ch++);  
            }
            System.out.println();
        }
        return(--ch);
    }
    static void pattern(String one, String two)
    {
        String result=one+two;
        int l=result.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            char ch=result.charAt(i);
            if(ch=='a' || ch=='A')
            {
                count++;
            }
        }
        System.out.println("The number of a's are: "+count);
    }
}