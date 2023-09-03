import java.util.*;
public class convertopp
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 characthers");
        String result="";
        char ch=' ';
        for(int i=1;i<=10;i++)
        {
            ch=sc.next().charAt(0);
            if(Character.isUpperCase(ch)==true)
            {
                ch=Character.toLowerCase(ch);
                result=result+ch;
            }
            else if(Character.isLowerCase(ch)==true)
            {
                ch=Character.toUpperCase(ch);
                result=result+ch;
            }
            else{
                result=result+ch;
            }
        }
        System.out.println(result);
    }
}