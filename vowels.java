import java.util.*;
public class vowels
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence.toLowerCase();
        int l=sentence.length();
        String result="";
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
              result=result+ch;  
            }
        }
        System.out.println("The vowels in the sentence "+sentence+ " is " + result);
    }
}