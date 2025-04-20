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


        System.out.println("\n4. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");


        System.out.println("\n5. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");


        System.out.println("\n6. АНАЛИЗ КОДА ТОВАРА");


        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");


        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
    }
}