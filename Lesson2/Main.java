public class Main {
    public static void runNonBooleanMethods(NonBooleanMethods inputNonBooleanMethods) {
        inputNonBooleanMethods.findLongestWordInSentence();
        inputNonBooleanMethods.selectMenuItem();
        inputNonBooleanMethods.calculateAverageScore();
        inputNonBooleanMethods.countUniqueWordsInWarAndPeace();
        inputNonBooleanMethods.showErrorMessage();
        inputNonBooleanMethods.synchronizeDataWithStorage();
        inputNonBooleanMethods.restoreDataFromBackup();
        inputNonBooleanMethods.pauseMp3FileDownload();
        inputNonBooleanMethods.resetVacuumCleanerToFactorySettings();
        inputNonBooleanMethods.writeContentOnUsbDrive();
        inputNonBooleanMethods.convertCelsiusToFahrenheit();
        inputNonBooleanMethods.enterMathExpressionWithThreeArguments();
        inputNonBooleanMethods.determineWinnerAmongNfsRacers();
        inputNonBooleanMethods.findBookByAuthorName();
    }

    public static void runBooleanMethods(BooleanMethods inputBooleanMethods) {
        System.out.println(inputBooleanMethods.isProgramContinuing());
        System.out.println(inputBooleanMethods.hasUniqueDigit());
        System.out.println(inputBooleanMethods.isLetterEntered());
        System.out.println(inputBooleanMethods.hasEqualDigits());
        System.out.println(inputBooleanMethods.areAttemptsRemaining());
        System.out.println(inputBooleanMethods.isEmptyOrWhitespace());
        System.out.println(inputBooleanMethods.isDiceRollEven());
        System.out.println(inputBooleanMethods.isFilePathValid());
        System.out.println(inputBooleanMethods.doesFileExist());
    }

    public static void main(String[] args) {
        NonBooleanMethods nonBooleanMethods = new NonBooleanMethods();
        BooleanMethods booleanMethods = new BooleanMethods();

        runNonBooleanMethods(nonBooleanMethods);
        runBooleanMethods(booleanMethods);
    }
}