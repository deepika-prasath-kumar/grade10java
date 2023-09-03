import java.util.*;
public class inti
{
    public static void main(String[]argS)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name with 3 words");
        String name=sc.nextLine();
        name=name.trim();
        name=name+" ";
        int l=name.length();
        String inti="";
        System.out.print(Character.toUpperCase(name.charAt(0)));
        for(int i=0;i<l-1;i++)
        {
            char ch=name.charAt(i);
            if(ch==' ')
            {
                inti=inti+name.charAt(i+1);
            }
        }
        inti=inti.toUpperCase();
        System.out.println(inti);
    }
}