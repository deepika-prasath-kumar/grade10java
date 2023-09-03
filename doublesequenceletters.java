import java.util.*;
public class doublesequenceletters
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
            if(m==(ch)){
                count++;
                
            }
            else{
                m=' ';
            }
        }
         System.out.println("The number of double sequences is"+count);
        }
    }
