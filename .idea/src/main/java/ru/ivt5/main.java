package ru.ivt5;

import ru.ivt5.v1.ListObject;

public class main {

    public static void main (String[] args) {
/* вывод присвоения
        Point p = new Point();
        p.setX(10);
        p.setY(20);
        System.out.println(p.getY());
*/

        ListObject array1 = new ListObject(5);
        // Создаём первый массив с переданными значениями

        array1.setElement(0, 1);
        array1.setElement(1, 2);
        array1.setElement(2, 3);
        array1.setElement(3, 4);
        array1.setElement(4, 5);

        // Создаём второй массив размером 5
        ListObject array2 = new ListObject(5);
        // Заполняем второй массив значениями
        array2.setElement(0, 6);
        array2.setElement(1, 7);
        array2.setElement(2, 8);
        array2.setElement(3, 9);
        array2.setElement(4, 10);


/* Вывод элемента по запросу пользователя с определенным индексом
        System.out.println("Array1: ");
        array1.print();
        Scanner scanner = new Scanner(System.in);// Создаём объект для чтения его с клавиатуры
        System.out.println("Введите индекс элемента массива для его вывода.");

        int index = scanner.nextInt();
        array1.getElement(index);
        System.out.println("Значение элемента c индексом " + index + " = " + array1.getElement(index));
*/




/* скалярное умножение массивов
        System.out.println("Array1: ");
        array1.print();

        ListObject result = array1.multiplication(5);
        System.out.print("multiplication of arrays: ");
        result.print();
*/

/* сложение массивов
        System.out.println("Array1: ");
        array1.print();
        System.out.print("Array2: ");
        array2.print();
        // Складываем массивы
        ListObject result = array1.add(array2);
        System.out.print("Sum of arrays: ");
        result.print();
*/

    }
}