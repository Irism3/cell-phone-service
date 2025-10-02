package com.pluralsight;

public class CellPhone {
    private String model;
    private String phoneNumber;
    private int serialNumber;
    private String carrier;
    private String owner;


    ///making a constructor
    public CellPhone(){
        this.model = "";
        this.phoneNumber = "";
        this.serialNumber = 0 ;
        this.carrier = "";
        this.owner = "";



    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model= model;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getSerialNumber (){
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber= serialNumber;
    }
    public String getCarrier(){
        return carrier;
    }
    public void setCarrier(String carrier){
        this.carrier= carrier;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    public void dial(String phoneNumber){
        System.out.println(this.owner + " 's phone is calling " + phoneNumber);
    }
    //public String toString(){
        //return model+ " "+phoneNumber+ " "+ serialNumber+ " "+ carrier +" "+owner;
    }








