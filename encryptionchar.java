import java.util.*;
public class encryptionchar
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word to encrypt");
        String word=sc.nextLine();
        word=word.toUpperCase();
        word=word.trim();
        int l=word.length();
        String result="";
        for(int i=0;i<l;i++)
        {
            char ch=word.charAt(i);
            int ascii=0;
            if(ch=='A' || ch=='E' || ch=='O' ||  ch=='I')
            {
                ascii=(int)ch+7;
                ch=(char)ascii;
                result=result+ch;
            }
            else if(ch=='U')
            {
                ch='B';
                result=result+ch;
            }
            else{
                result=result+ch;
            }
        }
        System.out.println(result);
    }
}