package ru.job4j.ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int amountOfRubles = 140;
        float euro = Converter.rubleToEuro(amountOfRubles);
        float dollar = Converter.rubleToDollar(amountOfRubles);
        System.out.println(amountOfRubles +  " rubles are " + euro + " euro.");
        System.out.println(amountOfRubles + " rubles are " + dollar + " dollar.");
    }
}

