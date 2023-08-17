package model;

public class Chocolate extends Product {

    private ChocolateBrand chocolateBrand;

    public Chocolate(int id, double price, String productName, ChocolateBrand chocolateBrand) {
        super(id, price, productName);
        this.chocolateBrand = chocolateBrand;
    }



    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String examine() {
        return  "ID: " + getId() +
                "\nPrice: kr" + getPrice() +
                "\nName: " + getProductName() +
                "\nBrand: " + chocolateBrand;
    }

    @Override
    public String use() {
        return getProductName() + ", " + chocolateBrand + ": kr" + getPrice();
    }
}
