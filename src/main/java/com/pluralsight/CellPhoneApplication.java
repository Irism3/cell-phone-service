package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone1 = new CellPhone();

        //display(cellPhone1);
        //display(cellPhone2);


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

        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);

        cellPhone2.setSerialNumber(10000);
        cellPhone2.setModel("iPhone 15");
        cellPhone2.setCarrier("T-Mobile");
        cellPhone2.setPhoneNumber("855-555-2222");
        cellPhone2.setOwner("Dana Wyatt's");

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
    }



        //printing details using string
    public static void display(CellPhone phone){
        System.out.println("Serial Number: "+ phone.getSerialNumber());
        System.out.println("Model:"+ phone.getModel());
        System.out.println("Carrier:"+ phone.getCarrier());
        System.out.println("Phone Number:"+ phone.getPhoneNumber());
        System.out.println("Owner:"+ phone.getOwner());


    }

}








