package model;

public class Nuts extends Product{
    private NutsFlavour nutsFlavour;

    public Nuts(int id, double price, String productName, NutsFlavour nutsFlavour) {
        super(id, price, productName);
        this.nutsFlavour = nutsFlavour;
    }

    @Override
    public String examine() {
        return  "ID: " + getId() +
                "\nPrice: kr" + getPrice() +
                "\nName: " + getProductName() +
                "\nFlavour: " + nutsFlavour;

    }

    @Override
    public String use() {
        return getProductName() + ", " + nutsFlavour + ": kr" + getPrice();
    }
}

