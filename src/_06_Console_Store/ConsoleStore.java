package _06_Console_Store;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

import _02_Generics_Store.Cart;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Food;
import _02_Generics_Store.*;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    	Cart<Food> cart = new Cart<Food>();
    	int money = 100;
    	Scanner scanner = new Scanner(System.in);
    	int number = 0;
    	boolean shopping = true;
    	do {
    		System.out.println("What foods would you like to buy: 1: Candy - $10 2: Cereal - $5");
    		number = scanner.nextInt();
    		scanner.nextLine();
    		if(number == 1) {
    			money = money -10;
    			cart.add(new Candy());
    		}
    		if(number == 2) {
    			money = money - 5;
    			cart.add(new Cereal());
    		}
    		System.out.println("Would you like to keep shopping?");
    		String answer = scanner.nextLine();
    		if(answer.equalsIgnoreCase("Yes")) {
    			shopping = true;
    		}
    		else {
    			shopping = false;
    		}
    	} while(shopping);
    	scanner.close();
    	System.out.println("You spent $" + (100 - money));
    	cart.showCart();
    }

}
