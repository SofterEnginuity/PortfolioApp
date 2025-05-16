package com.pluralsight;

public abstract class FixedAsset implements IValuable{

    private String name;


    public FixedAsset(String name, double value) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FixedAsset(String name, Double marketValue) {
        this.name = name;




    }
}
