import java.util.*;
public class altalpha
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=65;i<=90;i++)
        {
            if(i%2==0){
                char ch=(char)i;
                System.out.print(ch);
            }
        }
    }
}