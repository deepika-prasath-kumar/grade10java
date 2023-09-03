import java.util.*;
public class honda
{
    public int type;
    public int cost;
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        honda obj1=new honda();
        obj1.honda();
        obj1.gettype();
        obj1.find();
        obj1.printcost();
    }
    public void honda()
    {
        type=0;
        cost=0;
    }
    public void gettype()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the type of engine");
        type=sc.nextInt();
        System.out.println("Enter the previous cost");
        cost=sc.nextInt();
    }
    public void find()
    {
        if(type==2)
        {
            cost=(int)(10/100.0*cost)+cost;
        }
        else{
           cost=(int)(12/100.0*cost)+cost; 
        }
    }
    public void printcost()
    {
        System.out.println("The type of the engine is "+type);
        System.out.println("The cost of the new vehicle is"+ cost);
    }
}