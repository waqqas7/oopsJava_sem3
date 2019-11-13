package com.example.javalib;
import java.lang.Math;
import java.util.Scanner;
class Circle
{
    double r;
    Circle(double r)
    {
        this.r = r;
    }
    double area()
    {
        return Math.PI * Math.pow(r,2);
    }
}
class Sector extends Circle
{
    double ctr_ang;
    Sector(double r,double ctr_ang)
    {
        super(r);
        this.ctr_ang = Math.toRadians(ctr_ang);
    }
    double area()
    {
        return 0.5 * Math.pow(r,2) * ctr_ang;
    }
}
class Segment extends Circle
{
    double h;
    Segment(double r,double h)
    {
        super(r);
        this.h = h;
    }
    double area()
    {
        return Math.abs(Math.pow(r,2)*Math.toRadians((r-h)/r)) - ((r-h)*Math.sqrt((2*r*h)-Math.pow(h,2)));
    }
}
class compute
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        double r=sc.nextDouble();
        Circle ob1 = new Circle(r);
        System.out.println("Area of Circle = "+ob1.area());
        System.out.println("Enter the control angle of a sector");
        double ang=sc.nextDouble();
        Sector ob2 = new Sector(r,ang);
        System.out.println("Area of Sector = "+ob2.area());
        System.out.println("Enter the length of a segment in a circle");
        double l=sc.nextDouble();
        Segment ob3 = new Segment(r,l);
        System.out.println("Area of Segment = "+ob3.area());
    }
}
