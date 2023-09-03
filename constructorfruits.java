import java.util.*;
public class constructorfruits
{
    public int product_code;
    public String flavour;
    public String pack_type;
    public int pack_size;
    public int product_price;
    public void FruitJuice(int a,int b,int c)
    {
        System.out.println(a+b+c);
        product_code=0;
        flavour="";
        pack_type="";
        pack_size=0;
        product_price=0;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product code");
        product_code=sc.nextInt();
        System.out.println("Enter the flavour");
        flavour=sc.next();
        System.out.println("Enter the pack type");
        pack_type=sc.next();
        System.out.println("Enter the pack size");
        pack_size=sc.nextInt();
        System.out.println("Enter the product price");
        product_price=sc.nextInt();
    }
    public void discount()
    {
        product_price=product_price-10;
    }
    public void display()
    {
       System.out.println("The product code is"+product_code);
        System.out.println("The flavour is"+flavour);
        System.out.println("The pack type is "+pack_type);
        System.out.println("The pack size is "+pack_size);
        System.out.println("The product price is "+product_price);
    }
    public static void main(String[]args)
    {
        constructorfruits obj1=new constructorfruits();
        
        obj1.input();
        obj1.discount();
        obj1.display();
        obj1.FruitJuice(2,5,6);
    }
}