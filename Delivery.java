package com.mycompany.foodorderingapp;

import java.util.Scanner;

class Delivery
{  
    private int id;
    private String name;
    private String date;
    private String address;
    
    Delivery()
    {
        
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public String address()
    {
        return address;
    }
    
    void deliveryStatus()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your home address for delivery (definitely NOT to sell online): ");
        String ADDRESS = input.nextLine();
        
        System.out.println("Excellent! Your food will be sent to " + ADDRESS);
    }
}


