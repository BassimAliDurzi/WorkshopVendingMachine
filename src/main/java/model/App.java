package model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        System.out.println("(: *** Hello dear customer *** :) ");
        System.out.println();
        insertAmountGetBalance();
        chooseProduct();

    }
    private static void insertAmountGetBalance() {
        System.out.println("The machine accepts only the following values:\n" +
                "1,2,5,10,20,50,100,200,500,1000");
        System.out.println("Please inset amount:");
        Scanner scanner = new Scanner(System.in);
        int insertedAmount = scanner.nextInt();
        Order order = new Order(insertedAmount);
        System.out.println();
        order.addCurrency();
        System.out.println("Balance: kr" + order.getBalance());
        System.out.println();
    }
    private static void chooseProduct() {
        System.out.println("Type 1 for CHOCOLATE \n\t 2 for DRINK \n\t 3 for NUTS");
        Scanner scanner = new Scanner(System.in);
        int choiceNumber = scanner.nextInt();
        if( choiceNumber == 1) {
            System.out.println("Please choose your chocolate \nType 11 for MARS \n\t 12 for TWIX \n\t 13 for SNICKERS \n\t 14 for KITKAT");
            int chocolateChoice = scanner.nextInt();
            ChocolateBrand chocolateBrand = null;
            if (chocolateChoice == 11) {
                chocolateBrand = ChocolateBrand.MARS;
            } else if (chocolateChoice == 12) {
                chocolateBrand = ChocolateBrand.TWIX;
            } else if (chocolateChoice == 13) {
                chocolateBrand = ChocolateBrand.SNICKERS;
            } else if (chocolateChoice == 14) {
                chocolateBrand = ChocolateBrand.KITKAT;
                Chocolate chocolate = new Chocolate(chocolateChoice, 20, "Chocolate", chocolateBrand);
                System.out.println(chocolate.examine());
            }

        }
    }
}
