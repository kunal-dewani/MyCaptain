
/**
 * Write a description of class MinConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MinConversion
{
    int min;
    void convert(int min)
    {
        int year= min/(365*24*60);
        int day= min/(24*60)-year*365;
        System.out.println(year+" Years "+day+" Days");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Minutes.");
        MinConversion obj=new MinConversion();
        obj.min=sc.nextInt();
        System.out.println("Conversion is as follows:");
        obj.convert(obj.min);
    }
}

        