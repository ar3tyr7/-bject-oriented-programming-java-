package Wndg;

import java.net.InterfaceAddress;

public class Milk extends Product {
    private int longevity = 14;
    public Milk(String name, Double price, int longevity){
        super(name, price);
        this.longevity=longevity;
    }
    @Override
    public String toString(){
        return String.format("%s longevity = %d  " , super.toString(), longevity);
    }
}
