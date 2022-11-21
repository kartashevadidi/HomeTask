package org.example.homeTask.hm_4.task_4;

import org.example.homeTask.hm_4.task_2.CustomerData;

public class StaticField {
    public static void main(String[] args) {
        CustomerData newClients = new CustomerData();
        System.out.println(newClients.nameCustomer);
        System.out.println(newClients.ageCustomer);
        newClients.setText("test_1");
        System.out.println(newClients.getText());

        CustomerData oldClients = new CustomerData("Kate", 35);
        System.out.println(oldClients.nameCustomer);
        System.out.println(oldClients.ageCustomer);
        oldClients.setText("test_2");
        System.out.println(oldClients.getText());

        System.out.println(newClients.getText()); //выводила, что бы понять как работает
    }
}
