
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Employee
{
    String name;
    int yoj; //year of joining
    String address;
    long sal; //salary
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee name.");
        name=sc.nextLine();
        System.out.println("Enter Year of Joining.");
        yoj=sc.nextInt();
        System.out.println("Enter Employee address.");
        address=sc.nextLine();
        System.out.println("Enter salary");
        sal=sc.nextLong();
    }
    void print()
    {
        System.out.println(name+"\t"+yoj+"\t"+address+"\t"+sal);
    }
    public static void main(String args[])
    {
        Employee obj1=new Employee();
        Employee obj2=new Employee();
        Employee obj3=new Employee();
        obj1.input();
        obj2.input();
        obj3.input();
        System.out.println("Name\tYear of Joining\tAddress\tSalary");
        obj1.print();
        obj2.print();
        obj3.print();
    }
}