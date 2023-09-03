import java.util.*;
public class consonants
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence.toLowerCase();
        int l=sentence.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch==' '){
              count++; 
            }
        }
        int count2=l-count;
        System.out.println("The consonants in the sentence "+sentence+ " is " + count2);
    }
}