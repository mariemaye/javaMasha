package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

                  System.out.println("Enter number 1: ");
                   float a = in.nextFloat();
                   System.out.println("Your input is :" + a);
                   System.out.println("Enter nuber 2: ");
                    float b = in.nextFloat();
                    System.out.println("Your input is :" + b);
        TaskFirst task = new TaskFirst();
        System.out.println(task.summa);
        System.out.println(task.del);
        System.out.println(task.Sub);
        System.out.println(task.proizved);

    }
}
