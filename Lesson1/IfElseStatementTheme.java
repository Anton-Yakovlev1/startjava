public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("Пол не мужской");
        } else {
            System.out.println("Пол мужской");
        }

        int age = 30;
        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Ребенок");
        }

        double height = 1.91;
        if (height < 1.8) {
            System.out.println("Не баскетболист");
        } else {
            System.out.println("Баскетболист");
        }

        System.out.println("\n2. ПОИСК БО́ЛЬШЕГО ЧИСЛА ШАГОВ");
        int yesterdaySteps = 7644;
        int todaySteps = 14767;
        System.out.println("Количество шагов за вчера = " + yesterdaySteps +
                "\nКоличество шагов за сегодня = " + todaySteps);
        if (todaySteps > yesterdaySteps) {
            System.out.println("Сегодня было больше шагов");
        } else if (todaySteps == yesterdaySteps) {
            System.out.println("Вчера и сегодня одинаковое количество шагов");
        } else {
            System.out.println("Вчера было больше шагов");
        }
        double averageSteps = (double) (yesterdaySteps + todaySteps) / 2;
        System.out.println("Среднее значение шагов = " + averageSteps);

        System.out.println("\n3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ");
        int guestsCount = 14;
        if (guestsCount == 0) {
            System.out.println("Пока никто не записывался на мероприятие!\n");
        } else if (guestsCount % 2 == 0) {
            System.out.printf("Записалось %s гостей. Можно формировать пары для конкурсов.\n", guestsCount);
        } else if (guestsCount % 2 != 0) {
            System.out.printf("Записалось %s гостей. Нужны индивидуальные задания.\n", guestsCount);
        }

        System.out.println("\n4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");
        String nickname = "Assassin";
        char firstSymbol = nickname.charAt(0);

        // Первый способ решения
        String lowercaseLetters = "qwertyuiopasdfghjklzxcvbnm";
        String uppercaseLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String digits = "0123456789";
        String symbols = "!\"#$%&'()*+,-./:;<=>?@[]^_`{\\}~";
        if (lowercaseLetters.indexOf(firstSymbol) > -1) {
            System.out.printf("Имя %s начинается с маленькой буквы '%c'\n", nickname, firstSymbol);
        } else if (uppercaseLetters.indexOf(firstSymbol) > -1) {
            System.out.printf("Имя %s начинается с большой буквы '%c'\n", nickname, firstSymbol);
        } else if (digits.indexOf(firstSymbol) > -1) {
            System.out.printf("Имя %s начинается с цифры '%c'\n", nickname, firstSymbol);
        } else if (symbols.indexOf(firstSymbol) > -1) {
            System.out.printf("Имя %s начинается с символа '%c'\n", nickname, firstSymbol);
        }

        // Второй способ решения
        if (Character.isLowerCase(firstSymbol)) {
            System.out.printf("Имя %s начинается с маленькой буквы '%c'\n", nickname, firstSymbol);
        } else if (Character.isUpperCase(firstSymbol)) {
            System.out.printf("Имя %s начинается с большой буквы '%c'\n", nickname, firstSymbol);
        } else if (Character.isDigit(firstSymbol)) {
            System.out.printf("Имя %s начинается с цифры '%c'\n", nickname, firstSymbol);
        } else if (!Character.isLetterOrDigit(firstSymbol)) {
            System.out.printf("Имя %s начинается с символа '%c'\n", nickname, firstSymbol);
        }

        System.out.println("\n5. ИНВЕНТАРИЗАЦИЯ");
        int serialNum = 476;
        int officeComputerNum = 678;
        int firstGrade = (serialNum / 100) == (officeComputerNum / 100) ? (serialNum / 100) : -1;
        int secondGrade = ((serialNum / 10) % 10) == ((officeComputerNum / 10) % 10)
                ? ((serialNum / 10) % 10) : -1;
        int thirdGrade = (serialNum % 10) == (officeComputerNum % 10) ? (serialNum % 10) : -1;
        if (serialNum == officeComputerNum) {
            System.out.printf("[№%s]: компьютер на 3-м этаже в кабинете 2\n", officeComputerNum);
        } else if (((serialNum / 100) != (officeComputerNum / 100)) &&
                (((serialNum / 10) % 10) != ((officeComputerNum / 10) % 10)) &&
                ((serialNum % 10) != (officeComputerNum % 10))) {
            System.out.printf("[№%s]: оборудование не идентифицировано\n", officeComputerNum);
        } else {
            String result = String.format("Нет полного совпадения:" +
                    "\nБаза данных: [№%s]\nФактический: [№%s%s%s]\n",
                    serialNum, firstGrade, secondGrade, thirdGrade).replace("-1", "_");
            System.out.println(result);
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        float deposit = 321123.79f;
        if (deposit < 100000) {
            float depositWithInterest = deposit + (deposit * 0.05f);
            System.out.println("Сумма вклада: " + deposit +
            "\nСумма начисленного %: " + (depositWithInterest - deposit) +
            "\nИтоговая сумма с %: " + depositWithInterest);
        } else if (deposit > 300000) {
            float depositWithInterest = deposit + (deposit * 0.1f);
            System.out.println("Сумма вклада: " + deposit +
            "\nСумма начисленного %: " + (depositWithInterest - deposit) +
            "\nИтоговая сумма с %: " + depositWithInterest);
        } else {
            float depositWithInterest = deposit + (deposit * 0.07f);
            System.out.println("Сумма вклада: " + deposit +
            "\nСумма начисленного %: " + (depositWithInterest - deposit) +
            "\nИтоговая сумма с %: " + depositWithInterest);
        }

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");

        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
    }
}
