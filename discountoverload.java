import java.util.*;
public class discountoverload
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a for one discount, b for 2 discounts and c for 3 discounts");
        char disc=sc.next().charAt(0);
        
        switch(disc)
        {
            case 'a':
                {
                    System.out.println("Enter the discount");
                    int d1=sc.nextInt();
                    Discount(d1);
                    break;
                }
            case 'b':
                {
                   System.out.println("Enter 2 discounts");
                    int d2=sc.nextInt();
                    int d3=sc.nextInt();
                    Discount(d2,d3);
                    break; 
                }
            case 'c':
                {
                    System.out.println("Enter 3 discounts");
                    int d4=sc.nextInt();
                    int d5=sc.nextInt();
                    int d6=sc.nextInt();
                    Discount(d4,d5,d6);
                    break;
                }
        }
    }
    static void Discount(int a)
    {
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter your total final bill discluding the discount");
        int n=sc.nextInt();
        double finalbill=n-(a/100.0*n);
        System.out.println("Your final bill is"+finalbill);
    }
    static void Discount(int b,int c)
    {
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter your total final bill discluding the discount");
        int n=sc.nextInt();
        double a=n-(b/100.0*n);
        double finalbill=a-(c/100.0*a);
        System.out.println("Your final bill is"+finalbill);
    }
    static void Discount(int d,int e,int f){
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter your total final bill discluding the discount");
        int n=sc.nextInt();
        double a=n-((d/100.0)*n);
        double b=a-((e/100.0)*n);
        double finalbill=b-((f/100.0)*n);
        System.out.println("Your final bill is"+finalbill);  
    }
}