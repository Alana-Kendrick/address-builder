package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine().trim() + "\n";
        System.out.println(" ");

        System.out.print("Billing street: ");
        String billingStreet = scanner.nextLine() + "\n";
        System.out.print("Billing city: ");
        String billingCity = scanner.nextLine() + ", ";
        System.out.print("Billing state: ");
        String billingState = scanner.nextLine() + " ";
        System.out.print("Billing zip: ");
        int billingZip = scanner.nextInt();

        System.out.print("Shipping street: ");
        String shippingStreet = scanner.nextLine() + "\n";
        System.out.print("Shipping city: ");
        String shippingCity = scanner.nextLine() + ", ";
        System.out.print("Shipping state: ");
        String shippingState = scanner.nextLine() + " ";
        System.out.print("Shipping zip: ");
        int shippingZip = scanner.nextInt();

        StringBuilder address = new StringBuilder();
        address.append(fullName);
        address.append("\n");
        address.append("Billing Address: \n");
        address.append(billingStreet);
        address.append(billingCity);
        address.append(billingState);
        address.append(billingZip);

        String fullAddress = address.toString();
        System.out.println(fullAddress);

        scanner.close();
    }
}
