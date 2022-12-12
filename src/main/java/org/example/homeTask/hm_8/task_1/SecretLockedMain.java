package org.example.homeTask.hm_8.task_1;

import java.lang.reflect.Field;

//+
public class SecretLockedMain { // Locked -> Locke(r) - это не ошибка, но возможно опечатка
    public static void main(String[] args) throws Exception {
        SecretLocker secretLocker = new SecretLocker();

        System.out.println(secretLocker);

        Class<SecretLocker> secretLockerClass = SecretLocker.class;

        Field[] declaredFields = secretLockerClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("passcode")) {
                declaredField.setAccessible(true);
                declaredField.set(secretLocker, "2222");
            }
        }

        System.out.println(secretLocker);
    }
}
