package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Restaurant restaurant= new Restaurant();

        showMainPage();

        bufferedReader.close();

    }

    private static void showMainPage() throws IOException {
        System.out.println("Welcome, how can we help you today?");
        System.out.println("A. Home");
        System.out.println("B. Cart");
        System.out.println("C. Order tracking");
        System.out.println(" ");
        System.out.println("Insert your selection here: ");

        String line = readLine();
        switch (line){
            //home:
            case "A":
                showHomePage();
                String linea = readLine();
                switch (linea){
                    case "a":
                        break;
                    case "b":
                        break;
                    case "c":
                        break;
                    case "d":
                        break;
                    case "e":
                        break;
                    default:

                }
                break;
            //cart:
            case "B":
                showCartPage();
                String lineb = readLine();
                switch (lineb){
                    case "a":
                        break;
                    case "b":
                        break;
                    case "c":
                        break;
                    case "d":
                        break;
                    case "e":
                        break;
                    default:

                }
                break;
            //OrderTracking:
            case "C":
                showOrderTrackingPage();
                String linec = readLine();
                switch (linec){
                    case "a":
                    default:

                }
                break;
            default:
                System.out.println("option not available");
                showMainPage();
        }
    }

    private static void showOrderTrackingPage() {
        System.out.println("   a. Show the status of the order by id.");
    }

    private static void showCartPage() {
        System.out.println("   a. Add items to the cart with quantity.");
        System.out.println("   b. Delete items from the cart.");
        System.out.println("   c. Increment and decrease the quantity of items in the cart.");
        System.out.println("   d. Clean the cart.");
        System.out.println("   e. Submit an order.");
    }

    private static void showHomePage() {
        System.out.println("   a. Create user.");
        System.out.println("   b. Show restaurant orders.");
        System.out.println("   c. Show orders by status.");
        System.out.println("   d. Show orders by users.");
        System.out.println("   e. Show the menu.");
    }

    public static String readLine() throws IOException {
        return bufferedReader.readLine().trim();
    }
}