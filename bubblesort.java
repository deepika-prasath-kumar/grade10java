import java.util.*;
public class bubblesort
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 names in ascending order");
        String names[]=new String[5];
        for(int i=0;i<5;i++)
        {
            names[i]=sc.next();
        }
        int l=0;
        int m=0;
        int h=names.length-1;
        String temp="";
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5-1;j++)
            {
               temp=names[j];
               names[j]=names[j+1];
               names[j+1]=temp;
               
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(names[i]+" ");
        }
        
    }
}