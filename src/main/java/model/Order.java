package model;

import java.util.Arrays;
import java.util.Scanner;

public class Order implements IVendingMachine {

    private int amount;
    private Product id;


    public Order(int amount) {
        this.amount = amount;
    }

    @Override
    public void addCurrency() {
        int [] acceptsValue = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        int i = Arrays.binarySearch(acceptsValue, amount);
        if (i < 0) throw new IllegalArgumentException("The amount is not acceptable.");
        else{
            this.amount = amount;
        }

    }

    public Product getId() {
        return id;
    }

    @Override
    public int getBalance() {
        return amount;
        }

    @Override
    public Product request() {
        return getId();
    }


    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String[] getProduct() {
        return new String[0];
    }
}
