package com.Andrew77715.runners.converterRunner.Lesson7runner;

import java.util.Scanner;

public class LoopRunner {
    public  void calc() {
//        int i = (int) (Math.random() * 9);
        for (int k = 0; k < 11; k++) {
            System.out.println(k + " ");
        }

    }

    public void calc1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number and press 'Enter' ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        while (a > b) {
            System.out.println("Your a is " + a + " Your b is " + b);
            a = a - 1;
        }
        if (a < b) {
            System.out.println("Your number " + a + " is less than " + b);
        }

    }
    public  void calc3(){
        int a = 1;

        System.out.println("Original a value " + a);

        System.out.println("Post-increment a " + a++);

        System.out.println("After post-increment" + a);

        System.out.println("Pre-increment a " + ++a);

        System.out.println("After pre-increment" + a);
    }


    public static void  main (String[]args){
        int k = 0;
        for(int i = 0; i <= 20; i+=2){
            k++;
           // System.out.println(i);

           System.out.print(k);

       }
     // return(i);
    }


}


