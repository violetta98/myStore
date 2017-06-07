package com.company.Store;

/**
 * Created by Violetta on 07-06-2017.
 */
public abstract class AbstractSeller extends Person implements Seller {
    @Override
    public void sell() {
        System.out.println("I try to sell products!");
    }
    @Override
    public void attendWork() {
        System.out.print("I also try to go to work, but sometimes it's impossible because...");
        drink();
        System.out.println();
    }
    public abstract void drink();
}
