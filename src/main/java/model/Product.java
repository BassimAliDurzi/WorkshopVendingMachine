package model;

public abstract class Product {
    private int id;
    private double price;
    private String productName;

    public Product(int id, double price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }
    //Abstract method to display the product's information.
    public abstract String examine();
    //Abstract method to display the summary of product's information.
    public abstract String use();
}
