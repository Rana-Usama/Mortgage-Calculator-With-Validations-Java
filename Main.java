package com.firstone;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Principle ($1k-$1M) : ");
        Scanner scanner=new Scanner(System.in);
        int principle=scanner.nextInt();
        while (principle<1000||principle>1000_000)
        {
            System.out.println("Enter a amount between 1000 and 1000_000");
            System.out.print("Principle ($1k-$1M) : ");
            principle=scanner.nextInt();
            if (principle<1000||principle>1000_000)
            {
                continue;
            }
        }


        System.out.print("Annual interest : ");
        Scanner annual=new Scanner(System.in);
        double annual_amount=annual.nextDouble();
        while (annual_amount<0||annual_amount>30)
        {
            System.out.println("Enter amount greater than 0 and less than or equal to 30");
            System.out.print("Annual interest : ");
            annual_amount=annual.nextDouble();
            if (annual_amount<0||annual_amount>30)
            {
                continue;
            }
        }
        double after_dividing_by12=annual_amount/1200;

        System.out.print("Priods (Years) : ");
        Scanner periods=new Scanner(System.in);
        int no_of_months=periods.nextInt();
        while (no_of_months<1||no_of_months>30)
        {
            System.out.println("Enter a value between 1 and 30");
            System.out.print("Priods (Years) : ");
            no_of_months=periods.nextInt();
            if (no_of_months<1||no_of_months>30)
            {
                continue;
            }
        }
        long after_multiplication=no_of_months*12;

        double power=Math.pow(after_dividing_by12+1,after_multiplication);//formula solving
        double multiplication=principle*after_dividing_by12*power;//formula solving
        double minus_one=power-1;//formula solving
        double Mortgage=multiplication/minus_one;//formula solving

        NumberFormat currency=NumberFormat.getCurrencyInstance();//for getting ans in currency format
        String result=currency.format(Mortgage);
        System.out.print("Mortgage : ");
        System.out.print( result);

    }
}