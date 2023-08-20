package model;

import java.util.Arrays;
import java.util.Scanner;

public class Order implements IVendingMachine {

    private int amount;
    private int depositPool;
    private Product[] orderList;

    public Order() {
        this.amount = amount;
        this.orderList = new Product[4];
    }

    @Override
    public void addCurrency() {
        System.out.println("The machine accepts only the following values:\n" + "1,2,5,10,20,50,100,200,500,1000");
        Scanner scanner = new Scanner(System.in);
        byte addMoreMoney;
        do {
            System.out.println("Please insert amount:");
            int insertedAmount = scanner.nextInt();
            int[] acceptsValue = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
            int i = Arrays.binarySearch(acceptsValue, insertedAmount);
            if (i < 0) {
                System.out.println("The inserted amount is not acceptable.");
                break;
            } else {
                depositPool += insertedAmount;
            }
            System.out.println("Press 1: to add more money \nPress 0: to go to choose your product? ");
            addMoreMoney = scanner.nextByte();

        } while (addMoreMoney == 1);
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product[] request() {
        Scanner scanner = new Scanner(System.in);
        byte addMoreProducts;
        do {
            System.out.println("Type 1 for CHOCOLATE \n\t 2 for DRINK \n\t 3 for NUTS");
            int choiceNumber = scanner.nextInt();
            if (choiceNumber == 1) {
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
                }
                Chocolate chocolate = new Chocolate(chocolateChoice, 20, "Chocolate", chocolateBrand);
                orderList[0] = chocolate;
                System.out.println(chocolate.examine());

            } else if (choiceNumber == 2) {
                System.out.println("Please choose your drink \nType 21 for PEPSI \n\t 22 for SEVEN7UP \n\t 23 for FANTA");
                int drinkChoice = scanner.nextInt();
                DrinkBrand drinkBrand = null;
                if (drinkChoice == 21) {
                    drinkBrand = DrinkBrand.PEPSI;
                } else if (drinkChoice == 22) {
                    drinkBrand = DrinkBrand.SEVEN7UP;
                } else if (drinkChoice == 23) {
                    drinkBrand = DrinkBrand.FANTA;
                }
                Drink drink = new Drink(drinkChoice, 15, "Drink", drinkBrand);
                orderList[1] = drink;
                System.out.println(drink.examine());

            } else if (choiceNumber == 3) {
                System.out.println("Please choose your Nuts \nType 31 for MIX_ORIGINAL \n\t 32 for MIX_SPICY \n\t 33 for MIX_CHEDDAR");
                int nutsChoice = scanner.nextInt();
                NutsFlavour nutsFlavour = null;
                if (nutsChoice == 31) {
                    nutsFlavour = NutsFlavour.MIX_ORIGINAL;
                } else if (nutsChoice == 32) {
                    nutsFlavour = NutsFlavour.MIX_SPICY;
                } else if (nutsChoice == 33) {
                    nutsFlavour = NutsFlavour.MIX_CHEDDAR;
                }
                Nuts nuts = new Nuts(nutsChoice, 25, "Nuts", nutsFlavour);
                orderList[2] = nuts;
                System.out.println(nuts.examine());
            }
            System.out.println("Press 1: to add another product\nPress 0: to finish the process? ");
            addMoreProducts = scanner.nextByte();
        } while (addMoreProducts == 1);
        {
        }
        return orderList;
    }
    @Override
    public double getTotalAmount() {
        double totalAmount = 0;
        for (Product product : orderList) {
            if (product != null) {
                totalAmount += product.getPrice();
            }
        }
        System.out.println("The total amount: kr" + totalAmount);
        return totalAmount;
    }


    @Override
    public int endSession() {

        return getBalance();
    }

    @Override
    public String getDescription() {
        for (int i = 0; i < 4; i++) {
            if (orderList[i] != null) {
                System.out.println(orderList[i].examine());
        }
    }
        return getDescription();

    }

    @Override
    public String[] getProduct() {
        for (int i = 0; i < 4; i++) {
            if (orderList[i] != null) {
                System.out.println((i + 1) + ": " + orderList[i].use());
            }
        }
        return new String[0];
    }
}
