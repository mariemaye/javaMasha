package com.company;

import java.util.Scanner;

public abstract class Main {

    public static int i = 2345;
    public static float b = FromIntToFloat(i);
    public static char ch = '9';
    public static float k = FromCharToFloat(ch);
    public static String str1 = "2.1234";
    public static float f2 = FromStringToFloat(str1);
    public static int m = 45;
    public static String str = FromIntToString(m);
    public static char ch1 = 'D';
    public static String str2 = FromCharToString(ch1);


    public static void main(String[] args) {

        System.out.println("Task number 1 -> ");
        System.out.println("My name is Ovcharenko Mary Olegovna!\n");
        System.out.println("Task nuber 2 -> ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = in.nextInt();
        System.out.println("Your input is :" + a);
        if (a > 5) {
            System.out.println("S=A/B-C*5\n");
        }
        if (a < 5) {
            System.out.println("S=cos(B)-exp(C)\n");
        }
        if (a == 5){
            System.out.println("S=12-A\n");


        }




        //String str1 = "2.1234";
//System.out.println("From String to float:");
        //  Float f2 = Float.valueOf(str1);
        //  System.out.println(f2);

//int i = 2345;
//float f = (float)(i);
//System.out.println("From int to float:");
//System.out.println(f);


//char ch = '9';
//float k = Character.getNumericValue(ch);
//System.out.println("From char to float:");
//System.out.println(k);

//int m = 45;
//String str = Integer.toString(m);
//System.out.println("From int to string:");
//System.out.println(str);

//char ch1 = 'D';
//String charToString = Character.toString(ch1);
//System.out.println("From char to string:" );
//System.out.println(charToString);

    }
    public static float FromIntToFloat(int integer)
    {
        float f = (float)(integer);
        System.out.println("Task number 3->");
        System.out.println("From int to float:" +f);

        return f;
    }

    public static float FromCharToFloat(char chat )
    {
        float k = Character.getNumericValue(chat);
        System.out.println("From char to float:");
        System.out.println(k);
        return k;
    }

    public static  float FromStringToFloat(String str)
    {
        System.out.println("From String to float:");
        Float f2 = Float.valueOf(str);
        System.out.println(f2);
        return f2;
    }

    public static String FromIntToString(int n)
    {
        String str = Integer.toString(n);
        System.out.println("From int to string:");
        System.out.println(str);
        return str;
    }

    public static String FromCharToString(char ch2)
    {
        String str2 = Character.toString(ch2);
        System.out.println("From char to string:" );
        System.out.println(str2);
        return str2;

    }

}
