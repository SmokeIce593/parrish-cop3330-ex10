/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        int i = 1;
        float subtotal = 0;

        Scanner input = new Scanner(System.in);

        while (i != 4) {
            System.out.printf("Enter the price of item %d:", i);
            String valueString = input.nextLine();

            System.out.printf("Enter the quantity of item %d:", i);
            String quantityString = input.nextLine();

            int quantity = Integer.parseInt(quantityString);

            subtotal += Float.parseFloat(valueString) * quantity;
            i += 1;
        }
        float tax = subtotal * 0.055f;
        float totalcost = subtotal + tax;

        System.out.printf("Subtotal: $%.2f", subtotal);
        System.out.printf("\nTax: $%.2f", tax);
        System.out.printf("\nTotal: $%.2f", totalcost);

    }
}
