package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.print("What is the serial number?");
        int serialNumber = myScanner.nextInt();
        myScanner.nextLine();

        System.out.print("What model is the phone?");
        String model = myScanner.nextLine();

        System.out.print("Who is the carrier?");
        String carrier = myScanner.nextLine();

        System.out.print("What is the phone number?");
        String phoneNumber = myScanner.nextLine();

        System.out.print("Who is the owner of the phone?");
        String owner = myScanner.nextLine();

        // Use setters
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);




        //printing details using string

        //System.out.printf("serialNumber: %s%n",serialNumber);
        //System.out.printf("Model: %s%n",model);
        //System.out.printf("Carrier: %s%n",carrier);
        //System.out.printf("Phone Number: %s%n", phoneNumber);
        //System.out.printf("Owner: %s%n", owner);
        System.out.println("Serial Number: "+ phone.getSerialNumber());
        System.out.println("Model:"+ phone.getModel());
        System.out.println("Carrier:"+ phone.getCarrier());
        System.out.println("Phone Number:"+ phone.getPhoneNumber());
        System.out.println("Owner:"+ phone.getOwner());







    }

}
