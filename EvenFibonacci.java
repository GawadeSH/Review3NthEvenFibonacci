package com;

import java.util.Scanner;

public class EvenFibonacci
{
    public static void main(String[] args)
    {
        int n,num1=0,num2=1,num3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:-");
        n = s.nextInt();
        int count=0;


        for(int i=0;i<40;i++)
        {
            num3=0;
            num3=num1+num2;

            if(num3%2==0)
            {
                count++;

                if(n==count)
                {
                    System.out.println(num3);
                }
            }
            num1=num2;
            num2=num3;


        }




    }
}