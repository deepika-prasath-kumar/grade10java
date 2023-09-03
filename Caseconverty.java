import java.util.*;
public class Caseconverty
{
    String str;
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Caseconverty obj1=new Caseconverty();
        obj1.getstr();
        obj1.convert();
        obj1.display();
    }
    public void getstr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str=sc.next();
    }
    public void convert()
    {
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>=65&&ch<=90)
            {
                ch=Character.toLowerCase(ch);
            }
            else if(ch>=97&&ch<=122)
            {
                ch=Character.toUpperCase(ch);
            }
            result=result+ch;
        }
        str=result;
    }
    public void display()
    {
        System.out.print(str);
    }
}