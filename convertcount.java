import java.util.*;
public class convertcount
{
    public static void main(String[]argS)
    {
        Scanner sc=new Scanner(System.in);
        char ch=' ';
        int vowels=0;
        int cons=0;
        for(int i=1;i<=20;i++)
        {
            System.out.println("Enter a character");
            ch=sc.next().charAt(0);
            ch=Character.toUpperCase(ch);
            System.out.println(ch);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowels++;
            }
            else{
                cons++;
            }
        }
        System.out.println("The number of vowels is "+vowels+" the number of consonants are "+cons);
    }
}