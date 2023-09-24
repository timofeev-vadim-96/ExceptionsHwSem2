`Задача 1. `  
Реализована через REGEX-выражения во избежания блока try-catch для иключения класса NumberFormatException  

В том случае, если бы задача была решена все-таки через try-catch блок:
```java
//производилась бы проверка введенной строки на соответствие типу Float
    public boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
```

`Задача 2.  `
- блок try-catch для unchecked исключений излишний.
- обращение к несуществующему массиву intArray, создал его

Возможные случаи в коде, ~~если бы не магические числа~~:
1. деление на ноль
2. выход за границы массива

`Задача 3.  `
блок try-catch для unchecked исключений излишний.   
Возможные случаи в коде, ~~если бы не магические числа~~: 
1. деление на ноль
2. выход за границы массива

p.s. Излишним было также пробрасывание исключения в методе подсчета суммы двух чисел и в мейне.

`Задача 4`
Решена простой проверкой на пустую строку и пробрасыванием исключения класса IllegalArgumentException