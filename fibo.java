package com.example.javalib;
import java.util.*;
public class fibo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i=0,a=0,b=1,c=0;
        System.out.println("Enter the size");
        n=sc.nextInt();
        if(n==1)
            System.out.println("0");
        else if(n==2)
            System.out.println("0 1");
        else if(n>2)
        {
            System.out.print("0 1");
            for(i=1;i<=(n-2);i++)
            {
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
        }
    }
}
