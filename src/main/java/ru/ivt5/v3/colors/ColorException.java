package ru.ivt5.v3.colors;

public class ColorException extends Exception{

    //Поле для хранения кода ошибки
    private final ColorErrorCode errorCode;

    public ColorException(ColorErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ColorErrorCode getErrorCode() {
        return errorCode;
    }
}
