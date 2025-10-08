package com.startjava.lesson_2_3.method.naming;

public class BooleanMethods {
    public boolean shouldContinue() {
        System.out.print(Methods.getCurrentName() +
                "() -> программа выполняется далее или завершается? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(Methods.getCurrentName() +
                "() -> последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isLetter() {
        System.out.print(Methods.getCurrentName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(Methods.getCurrentName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return true;
    }

    public boolean isRemainingAttempt() {
        System.out.print(Methods.getCurrentName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }

    public boolean isBlank() {
        System.out.print(Methods.getCurrentName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenDiceRoll() {
        System.out.print(Methods.getCurrentName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidPath() {
        System.out.print(Methods.getCurrentName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isExistFile() {
        System.out.print(Methods.getCurrentName() +
                "() -> файл по указанному адресу существует? ");
        return false;
    }
}