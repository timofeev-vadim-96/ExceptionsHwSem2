package hwSem2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(0, 10);
        int d = 1;
        if (d == 0) throw new ArithmeticException("Divide by zero not permitted!");
        int[] intArray = new int[size];
        int index = 8;
        if (index >= intArray.length) throw new ArrayIndexOutOfBoundsException
                (String.format("Going outside the array. Size = %d\n", intArray.length));
        double catchedRes1 = intArray[index] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    }
}
