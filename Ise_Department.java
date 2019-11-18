package com.example.javalib;
import java.util.Scanner;
public class Faculty
{
    Scanner sc = new Scanner(System.in);
    {System.out.println("Enter the number of faculties");}
    public static  int n = (new Faculty()).sc.nextInt();
    public static String name[]=new String[n],desig[]=new String[n],joining_date[]=new String[n];
    public static int age[]=new int[n],exp_yrs[]=new int[n],subjects_handled[]=new int[n];
}





package com.example.javalib.ISE;
import java.util.Scanner;
import com.example.javalib.Department;
import com.example.javalib.Faculty;
class AgeException extends Exception
{
    AgeException(String s)
    {
        super(s);
    }
}
public class ISE_department implements Department
{
    Scanner sc = new Scanner(System.in);
    public void readdata()
    {
        for (int i = 0; i < Faculty.n; i++)
        {
            System.out.println("Enter the name");
            Faculty.name[i] = sc.nextLine();
            System.out.println("Enter the age");
            Faculty.age[i] = sc.nextInt();
            try
            {
                if(Faculty.age[i]<1 || Faculty.age[i]>58)
                    throw new AgeException("Invalid Age.Should be between 0 and 59.");
            }
            catch (Exception e) {
                System.out.println("Exception occured : " +e);
                System.exit(0);
            }
            sc.nextLine();
            System.out.println("Enter the designation (format : abc or abc,xyz,etc)");
            Faculty.desig[i] = sc.nextLine();
            System.out.println("Enter the years of experience");
            Faculty.exp_yrs[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the joining date (format : dd/mm/yyyy)");
            Faculty.joining_date[i] = sc.nextLine();
            System.out.println("Enter the number of subjects handled");
            Faculty.subjects_handled[i] = sc.nextInt();
            sc.nextLine();
        }
    }
    public void printdata()
    {
        for (int i = 0; i < Faculty.n; i++)
        {
            if (Faculty.exp_yrs[i] >= 20)
            {
                System.out.println("\n-----------------------------------------------\n");
                System.out.println("Name : " + Faculty.name[i]);
                System.out.println("Designation : " + Faculty.desig[i]);
                System.out.println("Age : " + Faculty.age[i]);
                System.out.println("Years of Experience : " + Faculty.exp_yrs[i]);
                System.out.println("Joining Date : " + Faculty.joining_date[i]);
                System.out.println("Subjects Handled : " + Faculty.subjects_handled[i]);
                print_number_designations(i);
                System.out.println("Number of Research Consultancy Projects : " + number_research_consultancy_projs(i));
            }
        }
    }
    public void print_number_designations(int i)
    {
        int count = Faculty.desig[i].length() - Faculty.desig[i].replace(",","").length();
        System.out.println("Number of Designations : "+(count+1));
    }
    public int number_research_consultancy_projs(int i)
    {
        return (Faculty.exp_yrs[i]*Faculty.subjects_handled[i])/4;
    }

}




package com.example.javalib;
import com.example.javalib.ISE.ISE_department;
public interface Department
{
    void readdata();
    void printdata();
    void print_number_designations(int i);
    int number_research_consultancy_projs(int i);
}
class MainClass
{
    public static void main(String args[])
    {
        ISE_department o = new ISE_department();
        o.readdata();
        o.printdata();
    }
}
