package org.example.homeTask.hm_4.task_2;

public class CustomerData {
    public String nameCustomer = "Diana";
    public Integer ageCustomer = 18;

    public static String getText() {
        String text = "Hello from static";
        return text;
    }
    public CustomerData(String nameCustomer, Integer ageCustomer) {
        this.ageCustomer = ageCustomer;
        this.nameCustomer = nameCustomer;
    }
    public CustomerData() {
        this.nameCustomer = "TEST ";
        this.ageCustomer = 100;

    }
    static {
        System.out.println("Hello new class");
    }
}
