package com.company;

import java.util.Scanner;

public class TaskFirst {
        public static float a;
       public static float b;
        public static float summa = MadeSumma(a,b);
        public static float del = MadeDivide(a,b);
        public static float Sub = MadeSubstraction(a,b);
        public static float proizved = MadeProduct(a,b);

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number 1: ");
            float a = in.nextFloat();
            System.out.println("Your input is :" + a);
            System.out.println("Enter nuber 2: ");
            float b = in.nextFloat();
            System.out.println("Your input is :" + b);
        }
        public static float MadeSumma ( float h, float j){
          h = a;
          j = b;
            float sum = a + b;
            return sum;
        }
        public static float MadeDivide ( float f, float k){
            f = a;
            k = b;
            if (k == 0) {
                System.out.println("Error! You can't divide on 0!");
                return 0;
            } else {
                float delt = f / k;
                return delt;
            }
        }
        public static float MadeSubstraction ( float q, float p){
            q = a;
            p = b;
            float substract = q - p;
            return substract;

        }
        public static float MadeProduct ( float n, float m){
            n = a;
            m = b;
            float product = n * m;
            return product;

        }

    }
