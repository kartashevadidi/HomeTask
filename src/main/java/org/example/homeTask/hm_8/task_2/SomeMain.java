package org.example.homeTask.hm_8.task_2;

import java.lang.reflect.Method;

public class SomeMain {
    public static void main(String[] args) throws Exception {
        SomeClass someClass = new SomeClass();

        Method method = someClass.getClass().getDeclaredMethod("someMethod");
        method.setAccessible(true);
        method.invoke(someClass);
    }
}
