package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        if (name.isEmpty()) {
            return valid;
        }
        if (Character.isDigit(name.codePointAt(0))) {
            return valid;
        }
        if (isUpperLatinLetter(name.codePointAt(0))) {
            return valid;
        }
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isUpperLatinLetter(code) || isSpecialSymbol(code) || isLowerLatinLetter(code)) {
                valid = true;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return Character.isUpperCase(code);
    }

    public static boolean isLowerLatinLetter(int code) {
        return Character.isLowerCase(code);
    }
}