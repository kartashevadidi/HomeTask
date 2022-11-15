package org.example.homeTask.hm_2.task_4;

//отформатируй код
public class NoMultiplication {
    public static void main(String[] args) {

        //суть ты уловила: умножение заменить сложением.
    /* я запустил твою программу, судя по цифрам мы 10 должны умножить на 55? А вот что делает твоя программа я не понял.
    Я хочу видеть две переменные и в конце результат их умножения, что-то вроде
    
    int firstNumber = 5;
    int secondNumber = 10;
    
    for....
    
    System.out.println(result);
    */
        int firstNumber = 5;
        int secondNumber = 10;
        int result = 0;

        for (int i = 1; i <= secondNumber; i++) {
            result += firstNumber;
        }
        System.out.println(result);

    }
}
