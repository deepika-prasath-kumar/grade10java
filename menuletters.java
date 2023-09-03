import java.util.*;
public class menuletters
{
    public static void main(String[]argS)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Z to A and 2 for a to z");
        int chose=sc.nextInt();
        int count=0;
        switch(chose)
        {
            case '1':
                {
                    for(int i=90;i<=65;i--)
                    {
                        char ch=(char)i;
                        System.out.print(ch);
                        count++;
                        if(count==10)
                        {
                            System.out.println();
                            count=0;
                        }
                    }
                }
            case '2':
                {
                    for(int i=97;i<=122;i++)
                    {
                        char ch=(char)i;
                        System.out.print(ch);
                        count++;
                        if(count==10)
                        {
                            System.out.println();
                            count=0;
                        }
                    }
                }
        }
    }
}