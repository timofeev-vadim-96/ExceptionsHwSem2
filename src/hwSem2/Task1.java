//Задача 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должен приводить к падению
//приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
//Задача 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package hwSem2;

import java.util.Scanner;

public class Task1 {

    private static final String NUMBER_REGEX =  "(\\d*\\.)?\\d+";

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.mirror(task1.getFloat()));
    }

    public float mirror(float inputFloat) {
        return inputFloat;
    }

    public float getFloat() {
        String inputString = prompt("Enter a number: ");
        //Задача 4
        if (inputString.isEmpty()){
            throw new IllegalArgumentException("the argument cannot be empty");
        }
        System.out.println(inputString.matches(NUMBER_REGEX));
        while (!inputString.matches(NUMBER_REGEX)) {
            System.out.println("The argument entered is not a number");
            inputString = prompt("Enter a number: ");
        }
        return Float.parseFloat(inputString);
    }

    public String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next();
    }
}
