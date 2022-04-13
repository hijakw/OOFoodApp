package com.mycompany.foodorderingapp;

import java.util.Scanner;

class Order extends FoodOrderingApp
{
    private int id;
    private String details;
    private double price;
    
    double pricey = 0;
    double total;
        
    Order()
    {
    
    }

    public int getID()
    {
        return id;
    }

    public String getDetails()
    {
        return details;
    }

    public double getPrice(int ID)
    {
        return this.price;
    }

    public double orderTotal(int ID)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the ID of the item you would like to order (Press 8 to exit): ");
        ID = input.nextInt();
        
        if (ID == 1 || ID == 2 || ID == 3 || ID == 5 || ID == 6)
        {
            pricey = 10.99;
        }

        if (ID == 4)
        {
            pricey = 9.99;
        }
        
        if (ID == 7)
        {
            pricey = 11.99;
        }

        if (ID == 8)
        {
            System.out.println("Exiting ordering system...");
        }

        return total;
    }
    
    public void addTotal()
    {
        total = total + pricey;
        System.out.println("Your total is: " + total);
    }

    public void processDebit()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Your full total is " + total);
        System.out.println("Enter your card number to complete your order: ");
        String cardNum = input.nextLine();
        
        if (cardNum.length() < 16)
        {
            System.out.println("Not a valid card number! We can't steal a card number that doesn't exist!");
        }
        
        else
        {
            System.out.println("Processing payment...");
            System.out.println("Thank you for your order! It shall arrive shortly...");
        }
    }
}
