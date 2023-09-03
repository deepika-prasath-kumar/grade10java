import java.util.*;
public class palindromeonly
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        int l=sentence.length();
        sentence=sentence+" ";
        String rev="";
        String word="";
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch==' ')
            {
                if(rev.equals(word)){
                    System.out.print(word+" ");
                }
                word="";
                rev="";
            }
            else{
                word=word+ch;
                rev=ch+rev;
            }
        }

    }
}