import java.util.*;
public class Compound
{
    public double Pamt;
    public double rate;
    public int Time;
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your principal amount");
        double principle=sc.nextDouble();
        System.out.println("Enter the rate");
        double Rate=sc.nextDouble();
        System.out.println("Enter the time");
        int time=sc.nextInt();
        Compound obj1=new Compound(principle,Rate,time);
        double result=obj1.FindInterest();
        
        obj1.printData();
        System.out.println("The compound intrest is"+result);
    }
    public Compound(double p,double r,int t)
    {
        Pamt=p;
        rate=r;
        Time=t;
    }
    public double FindInterest()
    {
        double ci=(double)(Pamt*(1+Math.pow((rate/100),Time)-Pamt));
        return(ci);
    }
    public void printData()
    {
        System.out.println(Pamt+" "+Time+" "+rate);
    }
}