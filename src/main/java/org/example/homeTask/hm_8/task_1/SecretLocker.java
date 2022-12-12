package org.example.homeTask.hm_8.task_1;

public class SecretLocker {
    private final String passcode;

    public SecretLocker() {
        this.passcode = "1111"; // твой способ называется "хард код". Аргумент в констукторе гораздо лучше
    }

    public String getPasscode() {
        return passcode;
    }

    @Override
    public String toString() {
        return "SecretLocker{" +
                "passcode='" + passcode + '\'' +
                '}';
    }
}
