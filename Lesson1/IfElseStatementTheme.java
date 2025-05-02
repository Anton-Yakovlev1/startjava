import java.math.BigDecimal;
import java.math.RoundingMode;

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
        } else {
            System.out.printf("Записалось %s гостей. Нужны индивидуальные задания.\n", guestsCount);
        }

        System.out.println("\n4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");
        String nickname = "Assassin";
        char firstSymbol = nickname.charAt(0);

        // Первый способ решения
        if (firstSymbol >= 'a' && firstSymbol <= 'z') {
            System.out.printf("Имя %s начинается с маленькой буквы '%c'\n", nickname, firstSymbol);
        } else if (firstSymbol >= 'A' && firstSymbol <= 'Z') {
            System.out.printf("Имя %s начинается с большой буквы '%c'\n", nickname, firstSymbol);
        } else if (firstSymbol >= '0' && firstSymbol <= '9') {
            System.out.printf("Имя %s начинается с цифры '%c'\n", nickname, firstSymbol);
        } else {
            System.out.printf("Имя %s начинается с символа '%c'\n", nickname, firstSymbol);
        }

        // Второй способ решения
        if (Character.isLowerCase(firstSymbol)) {
            System.out.printf("Имя %s начинается с маленькой буквы '%c'\n", nickname, firstSymbol);
        } else if (Character.isUpperCase(firstSymbol)) {
            System.out.printf("Имя %s начинается с большой буквы '%c'\n", nickname, firstSymbol);
        } else if (Character.isDigit(firstSymbol)) {
            System.out.printf("Имя %s начинается с цифры '%c'\n", nickname, firstSymbol);
        } else {
            System.out.printf("Имя %s начинается с символа '%c'\n", nickname, firstSymbol);
        }

        System.out.println("\n5. ИНВЕНТАРИЗАЦИЯ");
        int serialNum = 936;
        int officeComputerNum = 756;

        // Первый вариант решения выглядит более коротким, решил оставить
        /*
        int firstGrade = (serialNum / 100) == (officeComputerNum / 100) ? (serialNum / 100) : -1;
        int secondGrade = ((serialNum / 10) % 10) == ((officeComputerNum / 10) % 10) ?
                ((serialNum / 10) % 10) : -1;
        int thirdGrade = (serialNum % 10) == (officeComputerNum % 10) ? (serialNum % 10) : -1;
        if (serialNum == officeComputerNum) {
            System.out.printf("[№%s]: компьютер на 3-м этаже в кабинете 2\n", officeComputerNum);
        } else if (firstGrade == -1 && secondGrade == -1 && thirdGrade == -1) {
            System.out.printf("[№%s]: оборудование не идентифицировано\n", officeComputerNum);
        } else {
            String result = String.format("Нет полного совпадения:" +
                    "\nБаза данных: [№%s]\nФактический: [№%s%s%s]\n",
                    serialNum, firstGrade, secondGrade, thirdGrade).replace("-1", "_");
            System.out.println(result);
        }
        */
        boolean firstGrade = (serialNum / 100) == (officeComputerNum / 100) ? true : false;
        boolean secondGrade = ((serialNum / 10) % 10) == ((officeComputerNum / 10) % 10) ?
                true : false;
        boolean thirdGrade = (serialNum % 10) == (officeComputerNum % 10) ? true : false;
        if (firstGrade == false && secondGrade == false && thirdGrade == false) {
            System.out.printf("[№%s]: оборудование не идентифицировано\n", officeComputerNum);
        } else if (firstGrade == true && secondGrade == false && thirdGrade == false) {
            System.out.printf("Нет полного совпадения:" +
                    "\nБаза данных: [№%s]\nФактический: [№%d%c%c]\n",
                    serialNum, (officeComputerNum / 100), '_', '_');
        } else if (firstGrade == true && secondGrade == true && thirdGrade == false) {
            System.out.printf("Нет полного совпадения:" +
                    "\nБаза данных: [№%s]\nФактический: [№%d%d%c]\n",
                    serialNum, (officeComputerNum / 100), ((officeComputerNum / 10) % 10), '_');
        } else if (firstGrade == false && secondGrade == true && thirdGrade == false) {
            System.out.printf("Нет полного совпадения:" +
                    "\nБаза данных: [№%s]\nФактический: [№%c%d%c]\n",
                    serialNum, '_', ((officeComputerNum / 10) % 10), '_');
        } else if (firstGrade == false && secondGrade == true && thirdGrade == true) {
            System.out.printf("Нет полного совпадения:" +
                    "\nБаза данных: [№%s]\nФактический: [№%c%d%d]\n",
                    serialNum, '_', ((officeComputerNum / 10) % 10), (officeComputerNum % 10));
        } else if (firstGrade == false && secondGrade == false && thirdGrade == true) {
            System.out.printf("Нет полного совпадения:" +
                    "\nБаза данных: [№%s]\nФактический: [№%c%c%d]\n",
                    serialNum, '_', '_', (officeComputerNum % 10));
        } else if (firstGrade == true && secondGrade == false && thirdGrade == true) {
            System.out.printf("Нет полного совпадения:" +
                    "\nБаза данных: [№%s]\nФактический: [№%c%d%d]\n",
                    serialNum, (officeComputerNum / 100), '_', (officeComputerNum % 10));
        } else {
            System.out.printf("[№%s]: компьютер на 3-м этаже в кабинете 2\n", officeComputerNum);
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");

        // Первый способ
        float deposit = 321123.79f;
        float depositWithInterest;
        if (deposit < 100000) {
            depositWithInterest = deposit + (deposit * 0.05f);
        } else if (deposit > 300000) {
            depositWithInterest = deposit + (deposit * 0.1f);
        } else {
            depositWithInterest = deposit + (deposit * 0.07f);
        }
        System.out.println("Сумма вклада: " + deposit +
                    "\nСумма начисленного %: " + (depositWithInterest - deposit) +
                    "\nИтоговая сумма с %: " + depositWithInterest);

        // Второй способ
        BigDecimal depositBd = new BigDecimal("321123.79");
        BigDecimal depositWithInterestBd;
        if (depositBd.compareTo(BigDecimal.valueOf(100000)) == -1) {
            depositWithInterestBd = depositBd.add(depositBd.multiply(BigDecimal.valueOf(0.05)))
                    .setScale(2, RoundingMode.HALF_UP);
        } else if (depositBd.compareTo(BigDecimal.valueOf(300000)) == 1) {
            depositWithInterestBd = depositBd.add(depositBd.multiply(BigDecimal.valueOf(0.1)))
                    .setScale(2, RoundingMode.HALF_UP);
        } else {
            depositWithInterestBd = depositBd.add(depositBd.multiply(BigDecimal.valueOf(0.07)))
                    .setScale(2, RoundingMode.HALF_UP);
        }
        System.out.println("\nСумма вклада: " + depositBd +
                    "\nСумма начисленного %: " + depositWithInterestBd.subtract(depositBd) +
                    "\nИтоговая сумма с %: " + depositWithInterestBd);

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        int historyPercent = 59;
        int historyGrade = 5;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        }
        System.out.println("История: " + historyGrade);

        int programmingPercent = 92;
        int programmingGrade = 5;
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        }
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний бал оценок по предметам: " +
                (double) (historyGrade + programmingGrade) / 2);
        System.out.println("Средний % по предметам: " +
                (double) (historyPercent + programmingPercent) / 2);

        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        BigDecimal monthRevenue = new BigDecimal("13025.233");
        BigDecimal monthRent = new BigDecimal("5123.018");
        BigDecimal monthCost = new BigDecimal("9001.729");
        BigDecimal profit = monthRevenue.multiply(BigDecimal.valueOf(12))
                    .subtract(monthRent.multiply(BigDecimal.valueOf(12))
                    .add(monthCost.multiply(BigDecimal.valueOf(12))));
        if (profit.compareTo(BigDecimal.valueOf(0)) == 1) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }
    }
}
