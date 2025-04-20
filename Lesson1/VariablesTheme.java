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


        System.out.println("\n5. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");


        System.out.println("\n6. АНАЛИЗ КОДА ТОВАРА");


        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");


        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
    }
}