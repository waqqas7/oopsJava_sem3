package com.example.javalib;
import java.util.*;
public class stacks
{
    int stck[],top,max;
    stacks(int size)
    {
        stck = new int[size];
        max=size;
        top=-1;
    }
    int isfull()
    {
        if(top>=(max-1))
            return 1;
        return 0;
    }
    int isempty()
    {
        if(top<0)
            return 1;
        return 0;
    }
    void push(int item)
    {
        stck[++top]=item;
    }
    void pop()
    {
        if(isempty()==1)
            System.out.println("Stack underflow");
        else
            System.out.println("The element deleted is "+stck[top--]);
    }
    void display()
    {
        if(isempty()==1)
            System.out.println("No elements to display");
        else
        {
            int i;
            for(i=top; i>=0; i--)
                System.out.println(stck[i]);
        }
    }
    void stacktop()
    {
        if(isempty()==1)
            System.out.println("No top element to display");
        else
            System.out.println(stck[top]);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ch,size;
        System.out.println("Enter the size of stack");
        size=sc.nextInt();
        stacks ob = new stacks(size);
        do
        {
            System.out.println("Press 1 to push\nPress 2 to pop\nPress 3 to display\nPress 4 for top element\nPress 5 to exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: if(ob.isfull()==1)
                            System.out.println("Stack overflow");
                        else
                        {
                            System.out.println("Enter an element");
                            int a=sc.nextInt();
                        ob.push(a);
                        }
                        break;
                case 2: ob.pop();
                        break;
                case 3: ob.display();
                        break;
                case 4: ob.stacktop();
                        break;
                case 5: break;
                default: System.out.println("Incorrect choice");
            }
        }while(ch!=5);
    }

}
