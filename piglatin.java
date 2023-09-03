import java.util.*;
public class piglatin
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word to convert to piglatin");
        String word=sc.next();
        word=word.toUpperCase();
        int l=word.length();
        String split1="";
        String split2="";
        int count=0;
        for(int i=0;i<l;i++)
        {
            char ch=word.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                split1=word.substring(0,i);
                split2=word.substring(i,l);
                count++;
                break;
            }

        }
        if(count==1){
            String result=(split2+split1+"AY");
            System.out.println(result);
        }
        else{
            System.out.println(word+"AY");
        }
    }
}