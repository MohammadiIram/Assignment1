package com.company;

import java.util.Scanner;

class SimpleInterest {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num;
        float p,t,r,si;
        p= 1400;
        r=16;
        t=2;
        si=(p*r*t)/100;
        System.out.println("simple interest s:"+si);


    }
}
