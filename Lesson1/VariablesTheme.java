import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        final long start = System.nanoTime();
        final LocalTime localTimeStart = LocalTime.now();

        System.out.println("1. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        System.out.println("Первый вариант решения:");
        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discountPercent = 0.11f;
        float basePrice = penPrice + bookPrice;
        System.out.println("Стоимость товаров без скидки = " + basePrice);
        float discountSum = basePrice * discountPercent;
        System.out.println("Сумма скидки = " + discountSum);
        float discountPrice = basePrice - discountSum;
        System.out.println("Стоимость товаров со скидкой = " + discountPrice);

        System.out.println("\nВторой вариант решения:");
        BigDecimal penPriceBd = new BigDecimal("105.5");
        BigDecimal bookPriceBd = new BigDecimal("235.23");
        BigDecimal discountPercentBd = new BigDecimal("0.11");
        BigDecimal basePriceBd = penPriceBd.add(bookPriceBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Стоимость товаров без скидки = " + basePriceBd);
        BigDecimal discountSumBd = basePriceBd.multiply(discountPercentBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма скидки = " + discountSumBd);
        BigDecimal discountPriceBd = basePriceBd.subtract(discountSumBd)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("Стоимость товаров со скидкой = " + discountPriceBd);

        System.out.println("\n2. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println("                     /\\");
        System.out.println("   J    a  v     v  /  \\");
        System.out.println("   J   a a  v   v  /_() \\");
        System.out.println("J  J  aaaaa  V V  /      \\");
        System.out.println(" JJ  a     a  V  /___/\\___\\");

        System.out.println("\n3. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        byte temp = Byte.MAX_VALUE;
        System.out.println("[Температура, °C]\n" +
                "Исходное: " + temp);
        ++temp;
        System.out.println("+1: " + temp);
        --temp;
        System.out.println("-1: " + temp);
        short pressure = Short.MAX_VALUE;
        System.out.println("\n[Давление, Па]\n" +
                "Исходное: " + pressure);
        ++pressure;
        System.out.println("+1: " + pressure);
        --pressure;
        System.out.println("-1: " + pressure);
        int coveredDistance = Integer.MAX_VALUE;
        System.out.println("\n[Пройденное расстояние, м]\n" +
                "Исходное: " + coveredDistance);
        ++coveredDistance;
        System.out.println("+1: " + coveredDistance);
        --coveredDistance;
        System.out.println("-1: " + coveredDistance);
        long timeSinceStart = Long.MAX_VALUE;
        System.out.println("\n[Время с момента старта, сек]\n" +
                "Исходное: " + timeSinceStart);
        ++timeSinceStart;
        System.out.println("+1: " + timeSinceStart);
        --timeSinceStart;
        System.out.println("-1: " + timeSinceStart);
        char systemStatusCode = Character.MAX_VALUE;
        System.out.println("\n[Код состояния системы]\n" +
                "Исходное: " + (int) systemStatusCode);
        ++systemStatusCode;
        System.out.println("+1: " + (int) systemStatusCode);
        --systemStatusCode;
        System.out.println("-1: " + (int) systemStatusCode);

        System.out.println("\n4. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");

        // Метод с третьей переменной
        int a1 = 2;
        int b1 = 5;
        System.out.println("Исходные значения переменных: A1 = " + a1 + ", B1 = " + b1);
        int swap = a1;
        a1 = b1;
        b1 = swap;
        System.out.println("\nМетод: третья переменная\nРезультат: A1 = " + a1 + ", B1 = " + b1);

        // Метод арифметических операций
        a1 += b1;
        b1 = a1 - b1;
        a1 -= b1;
        System.out.println("\nМетод: арифметические операции\nРезультат: A1 = " + a1 + ", B1 = " + b1);

        // Метод побитовой операции ^
        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("\nМетод: побитовая операция ^\nРезультат: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("\n5. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
        int symbol1 = 1055;
        int symbol2 = 1088;
        int symbol3 = 1080;
        int symbol4 = 1074;
        int symbol5 = 1077;
        int symbol6 = 1090;
        System.out.printf("%s%5s%5s%5s%5s%5s%5s", "ACII-коды: ",
                symbol1, symbol2, symbol3, symbol4, symbol5, symbol6);
        System.out.printf("\n%s%3c%5c%5c%5c%5c%5c\n", "Расшифровка: ",
                symbol1, symbol2, symbol3, symbol4, symbol5, symbol6);

        System.out.println("\n6. АНАЛИЗ КОДА ТОВАРА");
        int productCode = 379;
        System.out.println("Код товара: " + productCode);
        int packageType = productCode % 10;
        int subcategory = (productCode / 10) % 10;
        int productCategory = productCode / 100;
        int checksum = productCategory + subcategory + packageType;
        int verificationCode = productCategory * subcategory * packageType;
        System.out.println("  категория товара - " + productCategory +
                "\n  подкатегория - " + subcategory + "\n  тип упаковки - " + packageType +
                "\nКонтрольная сумма = " + checksum + "\nПроверочный код = " + verificationCode);

        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        Runtime getRuntime = Runtime.getRuntime();
        int oneMb = 1024 * 1024;
        System.out.println("Доступное число ядер: " + getRuntime.availableProcessors());
        System.out.println("Используемая память: " +
                (getRuntime.totalMemory() - getRuntime.freeMemory()) / oneMb + " Мб");
        System.out.println("Свободная память: " +
                getRuntime.freeMemory() / oneMb + " Мб");
        System.out.println("Максимально доступная память: " +
                getRuntime.maxMemory() / oneMb + " Мб");
        char systemDrive = System.getProperty("user.home").charAt(0);
        double osVersion = Double.parseDouble(System.getProperty("os.version"));
        int javaVersion = Integer.parseInt(System.getProperty("java.version"));
        char separator = System.getProperty("path.separator").charAt(0);
        System.out.println("Системный диск: " + systemDrive);
        System.out.println("Версия ОС: " + osVersion);
        System.out.println("Версия Java: " + javaVersion);
        System.out.println("Сепаратор: " + separator);

        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        long finish = System.nanoTime();
        float result = (float) (finish - start) / 1000000000;
        LocalTime localTimeEnd = LocalTime.now();
        System.out.println("Старт проверки: " + dtf.format(localTimeStart));
        System.out.println("Финиш проверки: " + dtf.format(localTimeEnd));
        System.out.printf("Время работы: %.3f сек", result);
    }
}