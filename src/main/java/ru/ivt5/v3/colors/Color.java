package ru.ivt5.v3.colors;

public enum Color {

    RED,
    GREEN,
    BLUE;

    //fromString - статический метод, который принимает строку (colorString) и возвращает соответствующий объект Color.

    public static Color fromString(String colorString) throws ColorException {
        if (colorString == null) {
            throw new ColorException(ColorErrorCode.NULL_COLOR);
        }

        try {
            return Color.valueOf(colorString.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException(ColorErrorCode.WRONG_COLOR_STRING);
        }
    }

}
