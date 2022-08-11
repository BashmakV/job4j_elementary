package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || Character.isDigit(name.codePointAt(0)) || isUpperLatinLetter(name.codePointAt(0))) {
            valid = false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                valid = isUpperLatinLetter(code) || isSpecialSymbol(code) || isLowerLatinLetter(code) || Character.isDigit(code);
                if (!valid) {
                    break;
                }
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