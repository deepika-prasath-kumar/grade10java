import java.util.*;
public class wordsstartA
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to find number of words starting with 'A'");
        String sentence=sc.nextLine();
        sentence=sentence.toUpperCase();
        int l=sentence.length();
        int count=0;
        String word="";
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else{
                if(word.charAt(0)=='A')
                {
                    count++;
                }
                word="";
            }
        }
        System.out.println("The number of words starting with a are"+count);
    }
}