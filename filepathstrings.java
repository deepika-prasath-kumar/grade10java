import java.util.*;
public class filepathstrings
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file path including the name");
        String filepath=sc.nextLine();
        int l=filepath.length();
        int one=filepath.lastIndexOf('/');
        int two=filepath.lastIndexOf('.');
        String extension=filepath.substring(two,l);
        System.out.println(extension);
        String result=filepath.substring(one,two);
        System.out.println(result);
    }
}