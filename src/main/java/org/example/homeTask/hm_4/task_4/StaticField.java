package org.example.homeTask.hm_4.task_4;

import org.example.homeTask.hm_4.task_2.CustomerData;

public class StaticField {
    public static void main(String[] args) {
        CustomerData newClients = new CustomerData(); // newClients во множественном числе, а по факту он там один. Такое название могло бы подойти для массива
        System.out.println(newClients.nameCustomer); // я думаю эти данные можно было не печатать
        System.out.println(newClients.ageCustomer);
        newClients.setText("test_1");
        System.out.println(newClients.getText());

        CustomerData oldClients = new CustomerData("Kate", 35); // лучше не использовать в названиах префиксы new и old, если создать 3его кастомера, то какое название перееменной ему дать? newNewCustomer?
        System.out.println(oldClients.nameCustomer);
        System.out.println(oldClients.ageCustomer);
        oldClients.setText("test_2");
        System.out.println(oldClients.getText());

        System.out.println(newClients.getText()); //выводила, что бы понять как работает
    }
}
