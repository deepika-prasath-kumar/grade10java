import java.util.*;
public class magicstring
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=sc.nextLine();
        int len=word.length();
        magic(word,len);
        
    }
    public static void magic(String word2,int l)
    {
        int count=0;
        char m=' ';
        for(int i=0;i<l-1;i++)
        {
            char ch=word2.charAt(i);
            m=word2.charAt(i+1);
            if(m==(ch+1)){
                count++;
                System.out.println("The string is a magic string");
                break;
            }
            else{
                m=' ';
            }
        }
        if(count==0)
        {
           System.out.println("The string is not a magic string"); 
        }
    }
}