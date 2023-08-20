package model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("(: *** Hello dear customer *** :) ");
        System.out.println();
        Order order = new Order();
        order.addCurrency();
        System.out.println("Your balance: kr" + order.getBalance());
        System.out.println();
        order.request();
        System.out.println("******* ORDER DETAILS ******");
        System.out.println("Items:");
        order.getProduct();
        System.out.println("-----------------------------");
        order.getTotalAmount();
        System.out.println("-----------------------------");
        System.out.println("Your balance: kr" + order.getBalance());
        int balance = order.getBalance();
        double amount = order.getTotalAmount();
        if (balance >= amount) {
            double restAmount = balance - amount;
            System.out.println("The rest  amount kr: " + restAmount);
            if (restAmount > 0) {
                System.out.println("Please take the remaining amount from the machine");
            }
        } else {
            throw new IllegalArgumentException("Insufficient amount");
        }
        order.endSession();
        System.out.println("-----------------------------");
        System.out.println("The recent balance is ZERO");
        System.out.println("******* (: THANK YOU :) *******");
    }
}
