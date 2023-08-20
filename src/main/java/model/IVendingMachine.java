package model;

public interface IVendingMachine {
    void addCurrency();
    int getBalance();

    double getTotalAmount();
    Product[] request();
    int endSession();
    String getDescription();
    String[] getProduct();
}
