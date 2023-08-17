package model;

public interface IVendingMachine {
    void addCurrency();
    int getBalance();
    Product request();
    int endSession();
    String getDescription();
    String[] getProduct();
}
