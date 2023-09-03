import java.util.*;
public class setencereverse
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence+" ";
        int l=sentence.length();
        
        String result="";
        String word="";
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch==' '){
                result=word+" "+result;
                word="";
            }
            else{
                word=word+ch;
            }
        }
        System.out.println(result);
    }
}