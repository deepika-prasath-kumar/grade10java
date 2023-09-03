import java.util.*;
public class specialpalindrome
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=sc.next();
        int l=word.length();
        String rev="";
        char first=word.charAt(0);
        char last=word.charAt(l-1);
        if(first==last)
        {

            for(int i=0;i<l;i++)
            {
                char ch=word.charAt(i);
                rev=ch+rev;
            }

            if(rev.equals(word)){
              System.out.println("The word is a palindrome and  a special word");
            }
            else{
                System.out.println("The word is a special word but not a palindrome"); 

            }

        }
        else{
            System.out.println("The word is neither a special character nor a palindrome");
        }

    }
}