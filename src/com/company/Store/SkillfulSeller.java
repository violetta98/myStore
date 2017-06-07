package com.company.Store;

/**
 * Created by Violetta on 07-06-2017.
 */
public class SkillfulSeller extends AbstractSeller {
    @Override
    public void getSalary() {
        System.out.println("Obviously I earn a lot of money, approximately it is 150000$ in year :)");
    }
    @Override
    public void steal() {
        System.out.println("Sometimes I stole some products...");
    }
    @Override
    public void drink() {
        System.out.println("I never drink but I have some drugs");
    }
    @Override
    public String time() {
        return "1 minute";
    }
}
