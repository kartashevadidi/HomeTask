package org.example.homeTask.hm_4.task_3;

import org.example.homeTask.hm_4.task_2.CustomerData;

public class objectArray {
    public static void main(String[] args) {
        CustomerData[] customerData = new CustomerData[2];
        customerData[1] = new CustomerData("Dianaaaaa", 20);
        customerData[0] = new CustomerData();

        for (CustomerData customerDatum : customerData) {
            System.out.println();
            System.out.println("Name: " + customerDatum.nameCustomer);
            System.out.println("Age: " + customerDatum.ageCustomer);
        }
    }
}
