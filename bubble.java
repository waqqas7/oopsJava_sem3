package com.example.javalib;

import java.util.Scanner;

public class bubble
{
    public static void main(String args[])
    {
        int n,i,j,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        n=sc.nextInt();
        int A[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the number");
            A[i]=sc.nextInt();
        }
        System.out.println("Before sorting :");
        for(i=0;i<n;i++)
            System.out.print(A[i]+" ");
        for(i=0;i<n-1;i++)
        {
            for (j=0;j<n-1-i;j++)
            {
                if (A[j] > A[j + 1])
                {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter sorting (ascending order) :");
        for(i=0;i<n;i++)
            System.out.print(A[i]+" ");
    }
}
