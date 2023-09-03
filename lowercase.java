import java.util.*;
public class lowercase
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence.trim();
        int l=sentence.length();
        sentence=sentence.toLowerCase();
        char ch=' ';
        String sentence2=" ";
        char ch2=' ';
        for(int i=0;i<l;i++)
        {
            ch=sentence.charAt(i);
            if(ch=='a'&& ch=='e' && ch=='i' && ch=='o' && ch=='u'){
                ch2=(char)(ch+1);
                sentence2=sentence2+ch2;
            }
            else{
                sentence2=sentence+ch;
            }
        }
        System.out.println("The final sentence"+sentence2);
    }
}