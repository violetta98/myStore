package com.company;

import com.company.Store.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Violetta on 07-06-2017.
 */
public class Application implements Runnable {
    String name;
    public Application(String name) {
        this.name=name;
    }
    @Override
    public void run() {
        List<Seller> s = new LinkedList<>();
        List<Customer> c = new LinkedList<>();
        for (int i=0; i<20; i++)
            s.add(new StupidSeller());
        for (int i=0; i<2; i++)
            s.add(new SkillfulSeller());
        for (int i=0; i<100; i++)
            c.add(new Customer());
        Store Citrus = new Store("Citrus",s,c);
        for (int i=0; i<10; i++)
            Citrus.attendWork();
        for(int i=0; i<11; i++)
            Citrus.getSalary();
        for(int i=0; i<11; i++)
            Citrus.sell();
        for (int i=0; i<13; i++)
            Citrus.getTime();
        for(int i=0; i<15; i++)
            Citrus.steal();
        for (int i=0; i<12; i++)
            Citrus.complain();
        for (int i=0; i<13; i++)
            Citrus.pay();
    }
}
