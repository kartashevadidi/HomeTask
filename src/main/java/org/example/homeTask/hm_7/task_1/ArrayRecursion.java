package org.example.homeTask.hm_7.task_1;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,};
        recursion(0, array);
    }

    private static void recursion(int index, int[] a) {
        if (index > a.length - 1) {
            System.out.println("Finished");
        } else {
            System.out.println(a[index]);
            recursion(index + 1, a);
        }
    }
}
