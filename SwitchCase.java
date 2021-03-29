
/**
 * Write a description of class SwitchCase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class SwitchCase
{
    public static void main(String args[])
    {
        int choice;
        System.out.println("Enter 1 for hi, 2 for hey and 3 for hello");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: 
            System.out.println("hi");
            break;
            case 2:
            System.out.println("hey");
            break;
            case 3:
            System.out.println("hello");
            break;
            default:
            System.out.println("invalid input");
            break;
        }
    }
}
