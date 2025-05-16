package com.pluralsight;

public class House extends FixedAsset{

    private    int yearBuilt;
    private int squareFoot;
    private int bedrooms;

    public House(String name, double value) {
        super(name, value);
    }

    public House(String name, Double marketValue) {
        super(name, marketValue);
    }


    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public int getValue() {
        return 0;
    }
}
