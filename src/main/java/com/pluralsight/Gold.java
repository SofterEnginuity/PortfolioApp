package com.pluralsight;

public class Gold extends FixedAsset{

   private  double weight;

     public Gold(String name, Double marketValue, double weight) {
          super(name, marketValue);
          this.weight = weight;
     }

     public double getWeight() {
          return weight;
     }

     public void setWeight(double weight) {
          this.weight = weight;
     }

     @Override
     public int getValue() {
          return 0;
     }
}
