public class BooleanMethods {
    public boolean isProgramContinuing() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isLetterEntered() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return true;
    }

    public boolean areAttemptsRemaining() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }

    public boolean isEmptyOrWhitespace() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isDiceRollEven() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isFilePathValid() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean doesFileExist() {
        System.out.print(Methods.getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return false;
    }
}