import java.util.*;
public class overloadcheck
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer and a character");
        int a=sc.nextInt();
        char b=sc.next().charAt(0);
        System.out.println("Enter 2 integers and one character");
        int c=sc.nextInt();
        int d=sc.nextInt();
        char e=sc.next().charAt(0);
        calculate(a,b);
        calculate(c,d,e);
    }

    static void calculate(int m,char ch){
        int n1=0;
        if(ch=='s'){
            if(m%7==0){
                System.out.println("The integer is divisible by 7");
            }
            else{
                System.out.println("The integer is not divisible by 7");
            }
        }
        else{
            n1=m%10;
            if(n1==7){
                System.out.println("The last digit of your integer is equal to 7");
            }
        }
    }

    static void calculate(int a,int b, char ch){
        if(ch=='g'){
            System.out.println(Math.max(a,b));
        }
        else{
            System.out.println(Math.min(a,b));
        }
    }
} 