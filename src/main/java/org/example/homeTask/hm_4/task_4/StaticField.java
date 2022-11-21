package org.example.homeTask.hm_4.task_4;

import org.example.homeTask.hm_4.task_2.CustomerData;

public class StaticField {
    public static void main(String[] args) {
        CustomerData newClients = new CustomerData();
        System.out.println(newClients.nameCustomer);
        System.out.println(newClients.ageCustomer);


        System.out.println(newClients.getText());
    }
}
