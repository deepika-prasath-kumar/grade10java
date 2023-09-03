import java.util.*;
public class ifitrains{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence in uppercase");
        String sentence=sc.nextLine();
        sentence=sentence.trim();
        sentence=sentence.toLowerCase();
        sentence=" "+sentence;
        int l=sentence.length();
        char a=sentence.charAt(0);
        char m=' ';
        char ch=' ';
        char ch1=' ';
        String result="";
        for(int i=0;i<l;i++)
        {
           ch=sentence.charAt(i);
           
           if(ch==' ')
           {
               ch1=sentence.charAt(i+1);
               
             result=result+' '+(char)(ch1-32);
             i++;
           }
           else{
               result=result+ch;
           }
           
           
           
        }
        System.out.println(result);
    }
}