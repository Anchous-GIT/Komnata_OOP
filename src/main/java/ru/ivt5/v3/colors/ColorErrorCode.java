package ru.ivt5.v3.colors;


public enum ColorErrorCode {

    // Константы с описанием ошибки
    WRONG_COLOR_STRING("Недопустимое значение для цвета"),
    NULL_COLOR("Цвет не может быть null");

    // Поле для хранения описания ошибки
    private final String errorString;

    // Приватный конструктор для задания описания ошибки
    private ColorErrorCode(String errorString) {
        this.errorString = errorString; // Сохраняем значение в поле
    }

    // Геттер для получения описания ошибки
    public String getErrorString() {
        return errorString;
    }
}
