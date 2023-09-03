import java.util.*;
public class convertchar
{
    public static void main(String[]argS)
    {
        char ch=convert();
        System.out.println(ch);
    }
    static char convert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character to convert case");
        char ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch))
        {
           return(Character.toLowerCase(ch)); 
        }
        else{
            return(Character.toUpperCase(ch));
        }
    }
}