package com.example.javalib;
import java.util.Scanner;
abstract class Vehicle
{
    Scanner sc = new Scanner(System.in);
    int year_of_manufacture,m,sp;
    abstract void getData();
    abstract void putData();
    Vehicle()
    {
        year_of_manufacture=0;
    }
}
class TwoWheeler extends Vehicle
{
    void getData()
    {
        System.out.println("Enter the year of manufacture");
        year_of_manufacture = sc.nextInt();
        System.out.println("Enter the mileage in Km/L");
        m = sc.nextInt();
        System.out.println("Enter the top speed in Km/Hr");
        sp = sc.nextInt();
    }
    void putData()
    {
        System.out.println("Year of manufacture : "+year_of_manufacture);
        System.out.println("Mileage : "+m+"Km/L");
        System.out.println("Top Speed : "+sp+"Km/Hr");
    }
}
final class FourWheeler extends Vehicle
{
    void getData()
    {
        System.out.println("Enter the year of manufacture");
        year_of_manufacture = sc.nextInt();
        System.out.println("Enter the mileage in Km/L");
        m = sc.nextInt();
        System.out.println("Enter the top speed in Km/Hr");
        sp = sc.nextInt();
    }
    void putData()
    {
        System.out.println("Year of manufacture : "+year_of_manufacture);
        System.out.println("Mileage : "+m+"Km/L");
        System.out.println("Top Speed : "+sp+"Km/Hr");
    }
}
class MyTwoWheeler extends TwoWheeler
{
    {
        super.getData();
        super.putData();
    }
}
class Drive
{
    public static void main(String args[])
    {
        MyTwoWheeler ob = new MyTwoWheeler();
    }
}
