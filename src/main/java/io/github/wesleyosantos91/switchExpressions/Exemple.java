package io.github.wesleyosantos91.switchExpressions;

public class Exemple {

    /**
     * Exemple simple using Switch expressions
     * @param month
     * @return
     */
    public Integer getNumberMonth(Month month) {
        return switch (month) {
            case JANUARY -> 1;
            case FEBRUARY -> 2;
            case MARCH -> 3;
            case APRIL -> 4;
            case MAY -> 5;
            case JUNE -> 6;
            case JULY -> 7;
            case AUGUST -> 8;
            case SEPTEMBER -> 9;
            case OCTOBER -> 10;
            case NOVEMBER -> 11;
            case DECEMBER -> 12;
            default -> throw new IllegalArgumentException("Invalid month!");
        };
    }
}
