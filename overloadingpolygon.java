import java.util.*;
public class overloadingpolygon
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the square");
        int a=sc.nextInt();
        System.out.println("Enter the lettter you would like to fill the square with");
        char b=sc.next().charAt(0);
        polygon(a,b);
        System.out.println("Enter the length and breadth of the rectangle");
        int c=sc.nextInt();
        int d=sc.nextInt();
        polygon(c,d);
        polygon();
    }
    static void polygon(int n,char ch){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void polygon(int x,int y)
    {
       for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        } 
    }
    static void polygon(){
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}