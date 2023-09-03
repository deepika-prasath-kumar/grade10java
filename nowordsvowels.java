import java.util.*;
public class nowordsvowels
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a setence to count the number of vowels");
        String sentence=sc.nextLine();
        sentence=sentence.trim();
        sentence=sentence.toLowerCase();
        sentence=sentence+" ";
        int l=sentence.length();
        int count=0;
        int largest=0;
        String word="";
        String largestword="";
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
                 if(ch=='a' || ch=='e' || ch=='i' || ch=='u' || ch=='o')
               {
                count++;
               }
               
            }
            else{
               if(count>largest)
               {
                   largest=count;
                   largestword=word;
               }
               count=0;
               word="";
            }
            
        }
        System.out.println(largestword);
    }
}