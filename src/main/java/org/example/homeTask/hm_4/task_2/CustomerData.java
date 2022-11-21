package org.example.homeTask.hm_4.task_2;

public class CustomerData {
    public String nameCustomer = "Diana";
    public Integer ageCustomer = 18;
    private static String text = "Hello from static";

    static {
        System.out.println("Hello new class");
    }

    public CustomerData(String nameCustomer, Integer ageCustomer) {
        this.ageCustomer = ageCustomer;
        this.nameCustomer = nameCustomer;
    }

    public CustomerData() {
        this.nameCustomer = "TEST ";
        this.ageCustomer = 100;
    }

    public static String getText() {
        return text;
    }

    public void setText(String newText) {
        text = newText;
    }
}
