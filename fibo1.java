package com.example.javalib;
import java.util.*;
public class fibo1
{
    public static void main(String args[])
    {
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series upto " + num +" numbers : ");
        if(num==1)
            System.out.println("0");
        else if(num==2)
            System.out.println("0 1");
        else if(num>2)
        {
            System.out.print("0 1");
            fib(num,0,1);
        }
    }
    public static void fib(int n,int a,int b)
    {
        while(n>2)
        {
            System.out.print(" "+(a+b));
            fib(--n,b,(a+b));
            n=0;
        }
    }
}
