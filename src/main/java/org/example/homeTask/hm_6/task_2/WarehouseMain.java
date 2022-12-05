package org.example.homeTask.hm_6.task_2;

public class WarehouseMain {
    public static void main(String[] args) {
        int nextCount = 10;
        Warehouse warehouse = new Warehouse(new String[] {"Abibas", "Nike", "Hucchi"});
        for (int i = 0; i <= nextCount; i++){
            System.out.println(warehouse.next());
        }
    }
}
