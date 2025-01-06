package ru.ivt5.v3;

public class ListObject {
    private int[] array;

    //конструктор для создания массива с указанным размером
    public ListObject(int size) {
        if (size <=0) {
            throw new IllegalArgumentException("Размер массива должен быть больше 0.");
        }
        this.array = new int[size];
    }

    // Геттер для получения элементов массива
    public int getElement(int index){
        if (index < 0 || index >= array.length){
            throw new IndexOutOfBoundsException("Индекс вне границ массива");
        }
        return array[index];
    }

    // Сеттер для установки значения элемента массива
    public void setElement(int index, int value){
        if (index < 0 || index>= array.length){
            throw new IndexOutOfBoundsException("Индекс вне границ массива");
        }
        array[index] = value;
    }

    // Метод для сложения двух массивов
    // Метод add для сложения двух массивов

    public  ListObject add(ListObject other){
        if (this.array.length != other.array.length){
            throw new IllegalArgumentException("Массивы должны быть одинаковой длины");
        }
        ListObject result = new ListObject(array.length);//создание нового массива класса ListObject, его размер равен длине текущего массива

        for (int i = 0; i < array.length; i++){
            result.setElement(i, this.array[i] + other.getElement(i));
        }
        return result;
    }

    public ListObject multiplication(int scalar){
        ListObject result = new ListObject(array.length);
        for (int i = 0; i < array.length; i++){
            result.setElement(i, this.array[i] * scalar);
        }
        return result;
    }

    public void print(){
        System.out.println(java.util.Arrays.toString(array));
    }// java.util.Arrays.toString(array) Это статический метод из класса Arrays, который преобразует массив в строку.

}
