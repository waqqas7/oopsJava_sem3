package com.example.javalib;
import java.util.LinkedList;
public class l_lst
{

    public static void main(String args[])
    {
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("Waqqas");
        lst.add("B");
        lst.addLast("Vinay");
        lst.addFirst("cut");
        lst.add(2, "Yash");
        lst.add("F");
        lst.add("Talmiz");
        System.out.println("Linked list : " + lst);
        System.out.println("Names with length less than 5: ");
        for(int i=0;i<lst.size();i++)
        {
            if( lst.get(i).length() < 5)
                System.out.println(lst.get(i));
        }
    }
}