package com.codewithfaizan;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        System.out.println("Enter a Number to Check if its EVEN or ODD: ");
        int number = new Scanner(System.in).nextInt();
        isEven(number);
    }
    public static void isEven(int numb){
         if(numb % 2 == 0){
             System.out.println("Your Number " + numb + " is Even");
          }
         else{ System.out.println("Your Number " + numb + " is ODD");
             }
    }


}
