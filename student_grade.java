package com.example.javalib.StudentPackage;
import java.util.Scanner;
interface Student
{
    void getName();
    void getBranch();
}
class CreditLimit extends Exception
{
    CreditLimit(int i)
    {
        System.out.println("The Total credit is:"+i);
    }
}
public class RegisterStudent
{
    public RegisterStudent()
    {
        Student ob = new student();
        ob.getName();
        ob.getBranch();
        System.out.println("Enter the total numbers of credits registered");
        int tot_cr = ( new Scanner(System.in) ).nextInt();
        try
        {
            if(tot_cr>30)
                throw new CreditLimit(tot_cr);
            else
                System.out.println("The Total credit is:"+tot_cr);
        }
        catch(Exception e)
        {
            System.out.println(e+"\nException : Total Credits is more than 30");
            System.exit(0);
        }
        ((student) ob).collectMarks();
    }
}





package com.example.javalib.StudentPackage;
import java.util.Scanner;
public class student implements Student
{
    Scanner sc = new Scanner(System.in);
    public static String name,br;
    public static int sub1[] = new int[4], sub2[] = new int[4], sub3[] = new int[4];
    public void getName()
    {
        System.out.println("Enter your name");
        name=sc.nextLine();
    }
    public void getBranch()
    {
        System.out.println("Enter your branch");
        br=sc.nextLine();
    }
    void collectMarks()
    {
        for (int i = 0; i < 4; i++)
        {
            System.out.println("SEM " +(i+1)+ ":\nEnter marks for sub1");
            sub1[i] = sc.nextInt();
            System.out.println("Enter marks for sub2");
            sub2[i] = sc.nextInt();
            System.out.println("Enter marks for sub3");
            sub3[i] = sc.nextInt();
        }
    }
    public static char getGrade(int sub)
    {
        if(sub>=90)
            return 'S';
        else if(sub>=80)
            return 'A';
        else if(sub>=70)
            return 'B';
        else if(sub>=60)
            return 'C';
        else if(sub>=50)
            return 'D';
        else if(sub>=40)
            return 'E';
        return 'F';
    }
    public static float SGPA(int sem)
    {
        float sgpa=0.0f;
        if(getGrade(sub1[sem-1]) == 'S')
            sgpa += 4*10;
        else
            sgpa += 4* ( 74-(int)getGrade(sub1[sem-1]) );
        if(getGrade(sub2[sem-1]) == 'S')
            sgpa += 3*10;
        else
            sgpa += 3* ( 74-(int)getGrade(sub2[sem-1]) );
        if(getGrade(sub3[sem-1]) == 'S')
            sgpa += 2*10;
        else
            sgpa += 2* ( 74-(int)getGrade(sub3[sem-1]) );
        sgpa = sgpa/9;
        return sgpa;
    }
    public static float CGPA()
    {
        float cgpa;
        cgpa = ( SGPA(1)+SGPA(2)+SGPA(3)+SGPA(4) )/4;
        return cgpa;
    }
}





package com.example.javalib.ResultPackage;
import com.example.javalib.StudentPackage.RegisterStudent;
import static com.example.javalib.StudentPackage.student.*;
class InvalidSGPA extends Exception
{
    InvalidSGPA(String s)
    {
        super(s);
    }
}
public class Result
{
    public static void main(String[] args)
    {
        new RegisterStudent();
        System.out.println("Name : "+ name);
        System.out.println("Branch : "+ br);
        for(int i=0;i<4;i++)
        {
            System.out.println("Grade of Semester "+(i+1)+":");
            System.out.println("Grade of subject1: "+ getGrade(sub1[i]));
            System.out.println("Grade of subject2: "+ getGrade(sub2[i]));
            System.out.println("Grade of subject3: "+ getGrade(sub3[i]));
            try
            {
                if( SGPA(i+1)>10)
                    throw new InvalidSGPA("SPGA is greater than 10");
                else
                    System.out.println("SGPA of Semester "+(i+1)+": "+ SGPA(i+1));
            }
            catch(Exception e)
            {
                System.out.println("Invalid SGPA : "+e);
                System.exit(0);
            }
        }
        System.out.println("CGPA of 4 Semesters : "+CGPA());
    }
}
