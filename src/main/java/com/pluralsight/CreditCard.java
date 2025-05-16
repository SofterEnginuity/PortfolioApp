package com.pluralsight;

public class CreditCard {
    private double  charge;
    private  double pay;

    public CreditCard(double charge, double pay) {
        this.charge = charge;
        this.pay = pay;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
