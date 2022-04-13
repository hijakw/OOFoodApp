package com.mycompany.foodorderingapp;

import java.util.*;

public class FoodOrderingApp 
{
    public static void main(String[] args)
    {
        //Class declarations
        Admin admin = new Admin();
        Menu menu = new Menu();
        Order order = new Order();
        Delivery delivery = new Delivery();

        //Creates a user.
        admin.create();
        admin.login();

        //Menu prompts
        Scanner input = new Scanner (System.in);
        int choice = 0;

        do
        {
            System.out.println("Welcome to Subway!");
            System.out.println("Please choose what you would like to do (1-4):");
            System.out.println("(1) - View Menu");
            System.out.println("(2) - Order");
            System.out.println("(3) - Checkout");
            System.out.println("(4) - Exit");
            
            choice = input.nextInt();
            
            switch (choice)
            {
           
                case 1 ->
                {
                    menu.displayMenu();
                    break;
                }
                
                case 2 ->
                {
                    order.orderTotal(choice);
                    order.addTotal();
                    break;
                }
                
                case 3 ->
                {
                    delivery.deliveryStatus();
                    order.processDebit();
                    break;
                }
                    
                case 4 ->
                {
                    System.out.println("I hope the rest of your day is just like our subs (mediocre)!");
                    System.exit(0);
                    break;
                }
            }
       }while (choice != 4);
    }
}
