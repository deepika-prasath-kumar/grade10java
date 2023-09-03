import java.util.*;
public class patternsxyz
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String word=sc.nextLine();
        int l=word.length();
        for(int i=l;i>=1;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}