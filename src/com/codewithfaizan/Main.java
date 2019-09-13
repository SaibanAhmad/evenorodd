package com.codewithfaizan;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        System.out.println("Enter a Number to Check if its EVEN or ODD: ");
        int number = new Scanner(System.in).nextInt();

        if(isEven(number) == true){
            System.out.println("Your Number " + number + " is Even");
        }
        else{
            System.out.println("Your Number " + number + " is ODD");
        }

    }

    public static boolean isEven(int numb){
         if(numb % 2 == 0){
            return true;
          }
         else{ return false;
             }
    }


}
