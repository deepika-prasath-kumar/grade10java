import java.util.*;
public class removevowels
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        int l=sentence.length();
        sentence=sentence.trim();
        char ch=' ';
        String word=" ";
        for(int i=0;i<l;i++)
        {
            ch=sentence.charAt(i);
            if(ch!='a'&& ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                word=word+ch;
            }
        }
        System.out.println("The final word is"+word);
    }
}