
/**
 * Write a description of class MatrixOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MatrixOperations
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows and columns of matrix 1.");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int mat1[][]=new int[r1][c1];
        System.out.println("Enter the elements of Matrix 1.");
        for(int i=0; i<r1; i++)
        {
            for(int j=0; j<c1; j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no. of rows and columns of matrix 2.");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int mat2[][]=new int[r2][c2];
        System.out.println("Enter the elements of Matrix 2.");
        for(int i=0; i<r2; i++)
        {
            for(int j=0; j<c2; j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        if(r1==r2 && c1==c2)
        {
          int sum[][]=new int[r1][c1];
          for(int i=0; i<r1; i++)
          {
            for(int j=0; j<c1; j++)
            {
                sum[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
          }
        }
        else
        {
          System.out.println("Matrix Addition Not Possible");
        }
        if(c1==r2)
        {
            int prod[][]=new int[r1][c2];
            int k=0;
            for(int i=0; i<r1; i++)
            {
                for(int j=0; j<c2; j++)
                {
                   for(k=0; k<c1; k++)
                   {
                        prod[i][j]+=mat1[i][k] * mat2[k][j];
                   }
                   System.out.print(prod[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
          System.out.println("Matrix Multiplication Not Possible");
        }
    }
}
        
