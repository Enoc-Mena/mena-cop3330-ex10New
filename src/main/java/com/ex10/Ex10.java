/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex10;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        double item1Price, item2Price, item3Price;
        int item1Quantity, item2Quantity, item3Quantity;

        //Item 1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        item1Price = scan.nextDouble();

        Scanner item1 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 1: ");
        item1Quantity = item1.nextInt();

        double total1 = item1Price * item1Quantity;
        /*****************************************************/

        //Item 2
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter the price of item 2: ");
        item2Price = scan2.nextDouble();

        Scanner item2 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 2: ");
        item2Quantity = item2.nextInt();

        double total2 = item2Price * item2Quantity;
        /*****************************************************/

        //Item 3
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter the price of item 3: ");
        item3Price = scan3.nextDouble();

        Scanner item3 = new Scanner(System.in);
        System.out.print("Enter the quantity of item 3: ");
        item3Quantity = item3.nextInt();

        double total3 = item3Price * item3Quantity;
        /*****************************************************/

        //Output
        double subTotal = total1 + total2 + total3;
        double tax = subTotal * 0.055;
        double totalWithTax = tax + subTotal;


        System.out.println("");

        System.out.print("Your subtotal is: " + subTotal);

        System.out.println("");

        System.out.print("Tax: " + tax);

        System.out.println("");

        System.out.print("Total: " + totalWithTax);

    }

}
