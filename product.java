package com.example.javalib;
import java.util.*;
public class product
{
    Scanner sc = new Scanner(System.in);
    int m,n,A[][],i,j,k;
    product()
    {
        System.out.println("Enter number of rows and columns of the matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        A = new int[m][n];
    }
    product(product ob1,product ob2)
    {
        m=ob1.m;
        n=ob2.n;
        A = new int [m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=0;
                for(k=0;k<ob2.m;k++)
                    A[i][j] += ob1.A[i][k] * ob2.A[k][j];
            }
        }
    }
    void inputMatrix()
    {
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the element");
                A[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(A[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        product ob1 = new product();
        product ob2 = new product();
        if(ob1.n==ob2.m)
        {
            System.out.println("Enter for first Matrix");
            ob1.inputMatrix();
            System.out.println("Enter for second Matrix");
            ob2.inputMatrix();
            product ob3 = new product(ob1,ob2);
            System.out.println("---First Matrix---");
            ob1.display();
            System.out.println("---Second Matrix---");
            ob2.display();
            System.out.println("---Product Matrix---");
            ob3.display();
        }
        else
            System.out.println("Multiplication not possible");

    }
}
