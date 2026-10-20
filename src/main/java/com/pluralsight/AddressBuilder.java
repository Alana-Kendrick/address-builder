package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine().trim();
        System.out.println(" ");

        System.out.print("Billing street: ");
        String billingStreet = scanner.nextLine();
        System.out.print("Billing city: ");
        String billingCity = scanner.nextLine();
        System.out.print("Billing state: ");
        String billingState = scanner.nextLine();
        System.out.print("Billing zip: ");
        int billingZip = scanner.nextInt();
    }
}
