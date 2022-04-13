package com.mycompany.foodorderingapp;

import java.util.Scanner;

class Admin
{
    Scanner input = new Scanner (System.in);
    
    int id;
    String name;
    String age;
    String contactnum;
    String username;
    String password;
    
    void create()
    {
        System.out.println("Welcome! Please create a Subway's Suckers account!");
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age: ");
        age = input.nextLine();
        System.out.println("Finally, enter your contact number: ");
        contactnum = input.nextLine();

        System.out.println("Now, choose a username and a password!.");
        System.out.println("Username: ");
        username = input.nextLine();
        System.out.println("Password: ");
        password = input.nextLine();
        
        System.out.println("Great! Your account has been created! Enjoy, sucker!");
    }

    public boolean login()
    { 
        System.out.println("Enter your username");
        System.out.println("Username: ");
        String usernameCheck = input.nextLine();
        System.out.println("Password: "); 
        String passwordCheck = input.nextLine();

        return !((usernameCheck == null ? username != null : !usernameCheck.equals(username)) || (passwordCheck == null ? password != null : !passwordCheck.equals(password)));  
    }
}
