import java.util.*;
public class stringpalindrome
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=sc.next();
        int l=word.length();
        String rev="";
        for(int i=(l-1);i>=0;i--)
        {
            char ch=word.charAt(i);
            rev=rev+ch;
        }
        if(rev.equals(word)){
           System.out.println("The word is a palindrome"); 
        }
        else{
             System.out.println("The word is not a palindrome"); 
        }
    }
}