import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        System.out.println("Первый вариант решения:");

        // Стоимость ручки
        float penPrice = 105.5f;

        // Стоимость книги
        float bookPrice = 235.23f;

        // Размер скидки 11%
        float discountPercent = 0.11f;

        // Стоимость товаров без скидки
        float commonPrice = penPrice + bookPrice;
        System.out.println("Стоимость товаров без скидки = " + commonPrice);

        // Сумма скидки
        float discount = commonPrice * discountPercent;
        System.out.println("Сумма скидки = " + discount);

        // Стоимость товаров со скидкой
        float commonPriceWithDiscount = commonPrice - discount;
        System.out.println("Стоимость товаров со скидкой = " + commonPriceWithDiscount);
        System.out.println("Второй вариант решения:");

        // Стоимость ручки
        BigDecimal penPriceBd = new BigDecimal("105.5");

        // Стоимость книги
        BigDecimal bookPriceBd = new BigDecimal("235.23");

        // Размер скидки 11%
        BigDecimal discountPercentBd = new BigDecimal("0.11");

        // Стоимость товаров без скидки
        BigDecimal commonPriceBd = penPriceBd.add(bookPriceBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Стоимость товаров без скидки = " + commonPriceBd);

        // Сумма скидки
        BigDecimal discountBd = commonPriceBd.multiply(discountPercentBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма скидки = " + discountBd);

        // Стоимость товаров со скидкой
        BigDecimal commonPriceWithDiscountBd = commonPriceBd.subtract(discountBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Стоимость товаров со скидкой = " + commonPriceWithDiscountBd);

        System.out.println("\n2. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println("                     /\\");
        System.out.println("   J    a  v     v  /  \\");
        System.out.println("   J   a a  v   v  /_() \\");
        System.out.println("J  J  aaaaa  V V  /      \\");
        System.out.println(" JJ  a     a  V  /___/\\___\\");

        System.out.println("\n3. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");

        // Температура
        byte temperature = 127;
        System.out.println("[Температура, °C]\n" +
                "Исходное: " + temperature);
        byte temperatureIncrement = ++temperature;
        System.out.println("+1: " + temperatureIncrement);
        byte temperatureDecrement = --temperature;
        System.out.println("-1: " + temperatureDecrement);

        // Давление
        short pressure = 32767;
        System.out.println("\n[Давление, Па]\n" +
                "Исходное: " + pressure);
        short pressureIncrement = ++pressure;
        System.out.println("+1: " + pressureIncrement);
        short pressureDecrement = --pressure;
        System.out.println("-1: " + pressureDecrement);

        // Пройденное расстояние
        int coveredDistance = Integer.MAX_VALUE;
        System.out.println("\n[Пройденное расстояние, м]\n" +
                "Исходное: " + coveredDistance);
        int coveredDistanceIncrement = ++coveredDistance;
        System.out.println("+1: " + coveredDistanceIncrement);
        int coveredDistanceDecrement = --coveredDistance;
        System.out.println("-1: " + coveredDistanceDecrement);

        // Время с момента старта
        long timeSinceStart = 9223372036854775807l;
        System.out.println("\n[Время с момента старта, сек]\n" +
                "Исходное: " + timeSinceStart);
        long timeSinceStartIncrement = ++timeSinceStart;
        System.out.println("+1: " + timeSinceStartIncrement);
        long timeSinceStartDecrement = --timeSinceStart;
        System.out.println("-1: " + timeSinceStartDecrement);

        // Код состояния системы
        char systemStatusCode = 65535;
        System.out.println("\n[Код состояния системы]\n" +
                "Исходное: " + systemStatusCode);
        char systemStatusCodeIncrement = ++systemStatusCode;
        System.out.println("+1: " + systemStatusCodeIncrement);
        char systemStatusCodeDecrement = --systemStatusCode;
        System.out.println("-1: " + systemStatusCodeDecrement);

        System.out.println("\n4. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");

        // Первое значение
        int a1 = 2;

        // Второе значение
        int b1 = 5;
        System.out.println("Исходные значения переменных: A1 = " + a1 + ", B1 = " + b1);

        // Третья переменная
        int tempValue = a1;

        // Переопределение для метода с третьей переменной
        a1 = b1;
        b1 = tempValue;
        System.out.println("\nМетод: третья переменная\nРезультат: A1 = " + a1 + ", B1 = " + b1);

        // Метод арифмитических операций
        a1 += b1;
        b1 = a1 - b1;
        a1 -= b1;
        System.out.println("\nМетод: арифмитические операции\nРезультат: A1 = " + a1 + ", B1 = " + b1);

        // Метод побитовой операции ^
        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("\nМетод: побитовая операция ^\nРезультат: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("\n5. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
        int var1 = 1055;
        int var2 = 1088;
        int var3 = 1080;
        int var4 = 1074;
        int var5 = 1077;
        int var6 = 1090;
        System.out.printf("%s%15s%15s%15s%15s%15s%15s", "ACII-коды: ", var1, var2, var3, var4, var5, var6);
        System.out.printf("\n%s%14s%15s%15s%15s%15s%16s", "Расшифровка:", (char) var1, (char) var2,
                (char) var3, (char) var4, (char) var5, (char) var6 + "\n");

        System.out.println("\n6. АНАЛИЗ КОДА ТОВАРА");


        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");


        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
    }
}