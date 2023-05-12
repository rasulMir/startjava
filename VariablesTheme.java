public class VariablesTheme {

    public static void main(String[] args) {

        System.out.println("\n1. Вывод характеристик компьютера\n");
        byte ram = 8;
        short ssdMemory = 512;
        int coresNum = 8;
        long price = 1_200L;
        float diagonal = 13.3f;
        double weight = 1.4d;
        char cpu = 'M';
        boolean isTouchBarExist = true;
        System.out.println("Оперативная память (RAM): " + ram);
        System.out.println("Объем SSD: " + ssdMemory);
        System.out.println("Количество ядер: " + coresNum);
        System.out.println("Цена: " + price + " $");
        System.out.println("Диагональ: " + diagonal);
        System.out.println("Вес: " + weight);
        System.out.println("Процессор: " + cpu + "1");
        System.out.println("Панель Touch Bar: " + isTouchBarExist);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int pen = 100;
        int book = 200;
        byte discount = 11;

        int totalCostNoDiscount = pen + book;
        int discountSum = (pen / 100 * discount) + (book / 100 * discount);
        int totalCostDiscount = totalCostNoDiscount - discountSum;

        System.out.println("общую стоимость товаров без скидки " + totalCostNoDiscount);
        System.out.println("сумму скидки " + discountSum);
        System.out.println("общую стоимость товаров со скидкой " + totalCostDiscount);

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("      J    a  v     v  a   ");
        System.out.println("      J   a a  v   v  a a   ");
        System.out.println("   J  J  aaaaa  V V  aaaaa   ");
        System.out.println("    JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов\n");

        byte maxByteNum = 127;
        short maxShortNum = 32_767;
        int maxIntNum = 2_147_483_647;
        long maxLongNum = 9_223_372_036_854_775_807L;

        System.out.println("первоначальное значение " + maxByteNum);
        System.out.println("значение после инкремента на единицу " + maxByteNum++);
        System.out.println("значение после декремента на единицу " + maxByteNum--);

        System.out.println("первоначальное значение " + maxShortNum);
        System.out.println("значение после инкремента на единицу " + maxShortNum++);
        System.out.println("значение после декремента на единицу " + maxShortNum--);

        System.out.println("первоначальное значение " + maxIntNum);
        System.out.println("значение после инкремента на единицу " + maxIntNum++);
        System.out.println("значение после декремента на единицу " + maxIntNum--);

        System.out.println("первоначальное значение " + maxLongNum);
        System.out.println("значение после инкремента на единицу " + maxLongNum++);
        System.out.println("значение после декремента на единицу " + maxLongNum--);

        System.out.println("\n5. Перестановка значений переменных \n");

        int digitTwo = 2;
        int digitFive = 5;

        System.out.println("с помощью третьей переменной\n");
        System.out.println("digitTwo " + digitTwo);
        System.out.println("digitFive " + digitFive);
        int temp = digitTwo;
        digitTwo = digitFive;
        digitFive = temp;
        System.out.println("digitTwo " + digitTwo);
        System.out.println("digitFive " + digitFive);

        System.out.println("\nс помощью арифметических операций\n");
        System.out.println("digitTwo " + digitTwo);
        System.out.println("digitFive " + digitFive);
        digitTwo = digitFive + digitTwo;
        digitFive = digitTwo - digitFive;
        digitTwo = digitTwo - digitFive;
        System.out.println("digitTwo " + digitTwo);
        System.out.println("digitFive " + digitFive);

        System.out.println("\nс помощью арифметических операций\n");
        System.out.println("digitTwo " + digitTwo);
        System.out.println("digitFive " + digitFive);
        digitTwo = digitTwo ^ digitFive;
        digitFive = digitFive ^ digitTwo;
        digitTwo = digitTwo ^ digitFive;
        System.out.println("digitTwo " + digitTwo);
        System.out.println("digitFive " + digitFive);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char num1 = '#';
        char num2 = '&';
        char num3 = '@';
        char num4 = '^';
        char num5 = '_';

        System.out.println((int) num1 + "\t" + num1);
        System.out.println((int) num2 + "\t" + num2);
        System.out.println((int) num3 + "\t" + num3);
        System.out.println((int) num4 + "\t" + num4);
        System.out.println((int) num5 + "\t" + num5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char symbol1 = '/';
        char symbol2 = '\\';
        char symbol3 = '_';
        char symbol4 = '(';
        char symbol5 = ')';

        System.out.println("     " + symbol1 + symbol2);
        System.out.println("    " + symbol1 + "  " + symbol2);
        System.out.println("   " + symbol1 + symbol3 + symbol4 + " " + symbol5 + symbol2);
        System.out.println("  " + symbol1 + "      " + symbol2);
        System.out.println(" " + symbol1 + symbol3 + symbol3 + symbol3 + symbol3 + symbol1 + symbol2 + symbol3 + symbol3 + symbol2);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        int givenNum = 123;
        int ones = givenNum % 10;
        int tenners = (givenNum % 100 - ones) / 10;
        int hundreds = givenNum / 100;

        int numsSum = ones + tenners + hundreds;
        int numsProduct = ones * tenners * hundreds;

        System.out.println("Число " + givenNum + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(tenners + " десятков");
        System.out.println(ones + " единиц");

        System.out.println("Сумма его цифр " + numsSum);
        System.out.println("Произведение " + numsProduct);

        System.out.println("\n9. Вывод времени\n");

        int allSeconds = 86399;
        int seconds = allSeconds % 60;
        int minutes = ((allSeconds - seconds) / 60) % 60;
        int hours = ((allSeconds - seconds) / 60) / 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
        System.out.println("write");
    }
}
