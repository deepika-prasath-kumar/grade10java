import java.util.*;
public class wordup
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence.toUpperCase();
        int l=sentence.length();
        char caps=' ';
        int ascii=0;
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch==' '){
               caps=sentence.charAt(i+1);
               caps=(char)(caps+32);
               
            }
        }
    }
}