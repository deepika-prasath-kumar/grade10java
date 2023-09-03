import java.util.*;
public class lettersandwords
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        int l=sentence.length();
        char ch=' ';
        int count=0;
        for(int i=0;i<l;i++)
        {
            ch=sentence.charAt(i);
            if(ch==' ')
            {
              count++;  
            }
        }
        System.out.println("The number of words is"+(count+1));
        int letters=l-count;
        System.out.println("The number of letters is"+letters);
    }
}