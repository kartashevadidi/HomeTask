package org.example.homeTask.hm_8.task_2;

import org.example.homeTask.hm_7.task_2.Car;

public class Test {
private String name;

public Test( String name){
    this.name = name;
}

class BMW extends Test{
    private String number;

    public BMW ( String name, String number){
        super(name);
        this.number = number;
    }

    public BMW(String number){
        this(number, "sss");


    }
}
}
