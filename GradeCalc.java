
/**
 * Write a description of class GradeCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class GradeCalc
{
    public static void main(String args[])
    {
        System.out.println("Enter your score.");
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if(score>=80)
        {
            System.out.println("Grade: A");
        }
        else if (score>=70 && score<80)
        {
            System.out.println("Grade: B");
        }
        else if (score>=50 && score<70)
        {
            System.out.println("Grade: C");
        }
        else if (score>=40 && score<50)
        {
            System.out.println("Grade: D");
        }
        else if (score>=30 && score<40)
        {
            System.out.println("Grade: E");
        }
        else
        {
            System.out.println("Grade: F");
        }
    }
}
