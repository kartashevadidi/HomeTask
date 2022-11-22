package org.example.homeTask.hm_4.task_2;

// я бы еще предложил сделать класс с методом main и создать кастомера
public class CustomerData { // хорошее название для класса
    public String nameCustomer = "Diana"; // nameCustomer  -> name, эти поля итак принадлежат классу Customer, не надо дублировать в названии
    public Integer ageCustomer = 18; // ageCustomer -> age
    private static String text = "Hello from static"; // после 5ой лекции статик поля наверх

    static { // этот блок отработает только один раз за время работы программы, а если мы захотим создать два экземпляра? static здесь не подойдет
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
