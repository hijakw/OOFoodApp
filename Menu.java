package com.mycompany.foodorderingapp;

class Menu extends FoodOrderingApp
{  
    public int id;
    public String details;
    public String listofdish;

    public void displayMenu()
    {
        System.out.println("-----------------MENU----------------");
        System.out.println("$10.99 - Sweet Onion Chicken Teriyaki (ID #1)");
        System.out.println("$10.99 - Mozza Meat (ID #2)");
        System.out.println("$10.99 - Supreme Meats (ID #3)");
        System.out.println("$9.99 - Subway Club (ID #4)");
        System.out.println("$10.99 - Baja Turkey Avocado (ID# 5)");
        System.out.println("$10.99 - Baja Chicken and Bacon (ID# 6)");
        System.out.println("$11.99 - Meatball Marinara (ID# 7)");
        System.out.println("--------------------------------------");
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getDetails()
    {
        return details;
    }
    
    public String getList()
    {
        return listofdish;
    }
}
