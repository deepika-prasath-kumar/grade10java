import java.util.*;
public class patternsabcde
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string you would like to butcher");
        String input=sc.next();
        int l=input.length();
        for(int i=0;i<=l;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i%2!=0)
                {
                   System.out.print(Character.toUpperCase((input.charAt(j)))); 
                }
                else{
                  System.out.print(input.charAt(j));  
                }
            }
            System.out.println();
        }
    }
}