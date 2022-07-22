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
        float expectedEuro = 2;
        float expectedDollar = 2.3333333f;
        int amountOfRubles = 140;
        float euro = Converter.rubleToEuro(amountOfRubles);
        float dollar = Converter.rubleToDollar(amountOfRubles);
        boolean passedEuro = expectedEuro == euro;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println(amountOfRubles +  " rubles are " + euro + " euro. Test result : " + passedEuro);
        System.out.println(amountOfRubles + " rubles are " + dollar + " dollar.  Test result : " + passedDollar);
    }
}

