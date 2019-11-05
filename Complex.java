package com.example.javalib;
import java.util.*;
public class Complex
{
    double r1,r2,i1,i2;
    Complex()
    {
        r1=+0.0;
        i1=+0.0;
        r2=+0.0;
        i2=+0.0;
    }
    void add()
    {
        System.out.println("The sum = "+(r1+r2)+"+("+(i1+i2)+")i");
    }
    void sub()
    {
        System.out.println("The difference = "+(r1-r2)+"+("+(i1-i2)+")i");
    }
    void mul()
    {
        System.out.println("The product = "+(r1*r2-i1*i2)+"+("+(r1*i2+r2*i1)+")i");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Complex ob = new Complex();
        System.out.println("Enter the real and imaginary part of first complex number");
        ob.r1=sc.nextDouble();
        ob.i1=sc.nextDouble();
        System.out.println("Enter the real and imaginary part of second complex number");
        ob.r2=sc.nextDouble();
        ob.i2=sc.nextDouble();
        System.out.println("Press 1 to add\nPress 2 to subtract\nPress 3 to multiply");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1 : ob.add();
                break;
            case 2 : ob.sub();
                break;
            case 3 : ob.mul();
                break;
            default :System.out.println("Incorrect choice") ;
        }
    }
}