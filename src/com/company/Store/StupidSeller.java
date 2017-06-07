package com.company.Store;

/**
 * Created by Violetta on 07-06-2017.
 */
public class StupidSeller extends AbstractSeller {
    @Override
    public void getSalary() {
        System.out.println("Unfortunately I earn only 20000$in year because I am stupid :(");
    }
    @Override
    public void steal() {
        System.out.println("I stole many products in our store, sometimes I think that my boss surmise me...");
    }
    @Override
    public void drink() {
        System.out.println("I drink 5 times in week :)");
    }
    @Override
    public String time() {
        return "20 minutes";
    }
}
