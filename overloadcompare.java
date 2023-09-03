import java.util.*;
public class overloadcompare
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 integers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter 2 characters");
        char c=sc.next().charAt(0);
        char d=sc.next().charAt(0);
        System.out.println("Enter 2 strings");
        String e=sc.next();
        String f=sc.next();
        compare(a,b);
        compare(c,d);
        compare(e,f);
    }
    static void compare(int a,int b){
        System.out.println(Math.max(a,b));
    }
    static void compare(char c,char d){
      int x=(int)(c);
      int y=(int)(d);
      System.out.println(Math.max(x,y));
    }
    static void compare(String e,String f){
        int x=e.length();
        int y=f.length();
        System.out.println(Math.max(x,y));
    }
}