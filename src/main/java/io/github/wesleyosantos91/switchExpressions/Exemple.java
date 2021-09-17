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

    /**
     * Exemple simple using Pattern Matching for switch
     * @param obj
     * @return
     */
    public Integer getType(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default -> throw new IllegalArgumentException("Invalid obj!");
        };
    }
}
