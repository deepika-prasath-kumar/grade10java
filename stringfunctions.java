import java.util.*;
public class stringfunctions
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int a=s1.compareTo(s2);
        System.out.println(a);
        boolean tru=s1.startsWith(s2);
        System.out.println(tru);
    }
}