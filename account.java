package com.example.javalib;
import java.util.Scanner;
public class account
{
        int accno;
        String name;
        int Phone_no;
        float balance_amt;
        Scanner sc = new Scanner(System.in);
        void getinput()
        {
            System.out.println("BANK DETAILS :\nEnter your name");
            name=sc.nextLine();
            System.out.println("Enter your account number");
            accno=sc.nextInt();
            System.out.println("Enter your phone number");
            Phone_no=sc.nextInt();
            balance_amt=0.0f;
        }
        void Deposit()
        {
            System.out.println("Enter the amount to be deposited");
            float amt=sc.nextFloat();
            balance_amt += amt;
        }
        void Withdraw()
        {
            System.out.println("Enter the amount to be withdrawn");
            float amt=sc.nextFloat();
            balance_amt -= amt;
        }
        void Display()
        {
            System.out.println("Name : "+name+"\nAccount Numbber : "+accno+"\nPhone Number : "+Phone_no+"\nCurrent balance : "+balance_amt);
        }
        public static void main(String args[])
        {
            int ch;
            account ob = new account();
            ob.getinput();
            do
            {
                System.out.println("Press 1 to make a deposit\nPress 2 to make a withdrawal\nPress 3 to see bank details\nPress 4 to exit");
                ch=ob.sc.nextInt();
                switch(ch)
                {
                    case 1:ob.Deposit();
                        break;
                    case 2:ob.Withdraw();
                        break;
                    case 3:ob.Display();
                        break;
                    case 4:break;
                    default:System.out.println("Incorrect choice");
                }
            }while(ch!=4);
        }
}