package com.company.Store;

import sun.plugin.javascript.navig.Link;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Violetta on 07-06-2017.
 */
public class Store {
    String name;
    private List<Seller> sellers = new LinkedList<>();
    private List<Customer> customers = new LinkedList<>();
    public Store(String name, List<Seller> s, List<Customer> c) {
        this.name=name;
        this.sellers=s;
        this.customers=c;
    }
    public void addNewSeller(Seller s) {
        sellers.add(s);
    }
    public void addNewCustomer(Customer c) {
        customers.add(c);
    }
    public void attendWork() {
        for (Seller s : sellers)
            s.attendWork();
    }
    public void steal() {
        for (Seller s : sellers)
            s.steal();
    }
    public void getSalary() {
        for (Seller s : sellers)
            s.getSalary();
    }
    public void sell() {
        for (Seller s : sellers)
            s.sell();
    }
    public void pay() {
        for (Customer c : customers)
            c.pay();
    }
    public void complain() {
        for (Customer c : customers)
            c.complain();
    }
}
