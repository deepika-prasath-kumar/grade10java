import java.util.*;
public class largestword
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a setence to print the largest word");
        String sentence=sc.nextLine();
        sentence=sentence.trim();
        sentence=sentence.toUpperCase();
        sentence=sentence+" ";
        int l=sentence.length();
        int count=0;
        int length=0;
        String word="";
        String largestword="";
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch==' ')
            {
              length=word.length();
              if(length>count)
              {
                  count=length;
                  largestword=word;
              }
              word="";
              
            }
            else{
                word=word+ch;
            }
        }
        System.out.println(largestword);
    }
}