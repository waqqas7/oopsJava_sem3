package com.example.javalib;
import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        int c=0,num,i;
        System.out.println("Enter a number");
        num = new Scanner(System.in).nextInt();
        for(i=2;i<=num;i++)
        {
            if(num%i == 0)
                c++;
        }
        if(c==1)
            System.out.print("It is a prime number");
        else
            System.out.print("It is not a prime number");
    }
}
