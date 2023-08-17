package model;

public class Drink extends Product{
    private DrinkBrand drinkBrand;

    public Drink(int id, double price, String productName, DrinkBrand drinkBrand) {
        super(id, price, productName);
        this.drinkBrand = drinkBrand;
    }

    @Override
    public String examine() {
        return  "ID: " + getId() +
                "\nPrice: kr" + getPrice() +
                "\nName: " + getProductName() +
                "\nBrand: " + drinkBrand;

    }

    @Override
    public String use() {
        return getProductName() + ", " + drinkBrand + ": kr" + getPrice();
    }
}
