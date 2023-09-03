import java.util.*;
public class uniquesentence
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String sentence=sc.next();
        int l=sentence.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            for(int j=i+1;j<l;j++)
            {
                char ch2=sentence.charAt(j);
                if(ch==ch2)
                {
                    count++;
                }
            }
        }
        if(count==0)
        {
            System.out.println("the word is unique");
        }
        else{
            System.out.println("The word is not unqiue");
        }
    }
}