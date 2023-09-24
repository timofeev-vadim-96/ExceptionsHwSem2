package hwSem2;

public class Task3 {
    public static void main(String[] args) {
            int a = 90;
            int b = 3; //если бы не магическое число, а значение переменной, то:
            if (b == 0) throw new ArithmeticException("Divide by zero not permitted!");
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            int index = 3; //снова маг число, всегда больше размера массива, но:
            //избегаем ArrayIndexOutOfBoundsException
            if (index < abc.length) abc[index] = 9;
        }
    //было лишним пробрасывание исключения FileNotFoundException
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
