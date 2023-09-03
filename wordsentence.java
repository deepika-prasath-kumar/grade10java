import java.util.*;
public class wordsentence
{
    public static void main(String[]argS)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence+" ";
        int l=sentence.length();
        for(int i=0;i<l;i++)
        {
            char a=sentence.charAt(i);
            if(a==' ')
            {
                l=l-i;
                sentence=sentence.substring(i,l);
                System.out.println(sentence);
            }
        }
    }

}
