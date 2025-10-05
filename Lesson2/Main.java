public class Main {
    public static void main(String[] args) {
        runNonBooleanMethods();
        runBooleanMethods();
    }

    private static void runNonBooleanMethods() {
        NonBooleanMethods nonBm = new NonBooleanMethods();

        nonBm.findLongestWord();
        nonBm.selectMenuItem();
        nonBm.calculateAverageScore();
        nonBm.countUniqueWords();
        nonBm.showErrorMessage();
        nonBm.syncDataWithStorage();
        nonBm.restoreDataFromBackup();
        nonBm.pauseFileDownload();
        nonBm.resetSettingsToDefault();
        nonBm.writeToFile();
        nonBm.convertCelsiusToFahrenheit();
        nonBm.inputMathExpression();
        nonBm.determineWinner();
        nonBm.findBookByAuthor();
    }

    private static void runBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();

        System.out.println(bm.shouldContinue());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.isRemainingAttempt());
        System.out.println(bm.isBlank());
        System.out.println(bm.isEvenDiceRoll());
        System.out.println(bm.isValidFilePath());
        System.out.println(bm.isExistFile());
    }
}