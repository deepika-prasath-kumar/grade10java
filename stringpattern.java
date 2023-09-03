import java.util.*;
public class stringpattern
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String word=sc.next();
        int l=word.length();
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(word.charAt(i-1));
            }
            System.out.println();
        }
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(word.charAt(j-1));
            }
            System.out.println();
        }
        for(int i=l;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(word.charAt(i-1));
            }
            System.out.println();
        }
        for(int i=l;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(word.charAt(j-1));
            }
            System.out.println();
        }
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=l-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(word.charAt(i-1));
            }
            System.out.println();
        }
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=l-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(word.charAt(k-1));
            }
            System.out.println();
        }
        for(int i=l;i>=1;i--)
        {
            char ch='a';
            for(int j=1;j<5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        for(int i=l;i>=1;i--)
        {
            for(int j=1;j<5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(word.charAt(k-1));
            }
            System.out.println();
        }
    }
}