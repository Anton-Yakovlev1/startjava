public class BooleanMethods {
    public boolean shouldContinue() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isLetter() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return true;
    }

    public boolean isRemainingAttempt() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }

    public boolean isBlank() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenDiceRoll() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidFilePath() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isExistFile() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return false;
    }
}