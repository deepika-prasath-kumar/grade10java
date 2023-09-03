import java.util.*;
public class movieMagic
{
  public int year;
  public String title;
  public float rating;
  public void movieMagic(int a,int b)
  {
      System.out.println(a+b);
      year=0;
      title="";
      rating=0;
  }
  public void accept()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the title");
      title=sc.next();
      System.out.println("Enter the year");
      year=sc.nextInt();
      System.out.println("Enter the rating");
      rating=sc.nextFloat();
  }
  public void display()
  {
      System.out.println("The title of the movie is "+title);
      System.out.println("The year of the movie is "+year);
      if(rating>=0.0 && rating<=2.0)
      {
          System.out.println("Flop");
      }
      else if(rating>=2.1 && rating<=3.4)
      {
          System.out.println("Semi-hit");
      }
      else if(rating>=3.5&& rating<=4.5){
          System.out.println("Hit");
      }
      else{
          System.out.println("Super hit");
      }
  }
  public static void main(String[]args)
  {
      movieMagic obj1=new movieMagic();
      obj1.movieMagic(2,3);
      obj1.accept();
      obj1.display();
      
  }
}