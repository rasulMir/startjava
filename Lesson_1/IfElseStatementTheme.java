public class IfElseStatementTheme {

    public static void main(String[] args) {

        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        int age = 26;

        if (age > 20) {
            System.out.println("Старше двадцати\n");
        } else {
            System.out.println("Младше двадцати\n");
        }

        boolean isMale = true;

        if (!isMale) {
            System.out.println("A male\n");
        } else {
            System.out.println("A female\n");
        }

        double height = 1.77;

        if (height < 1.80) {
            System.out.println("ниже 1.80 см\n");
        } else {
            System.out.println("выше 1.80 см\n");
        }


        char nameFirstLetter = "Rasul".charAt(0);

        if (nameFirstLetter == 'M') {
            System.out.println("первая буква М\n");
        } else if (nameFirstLetter == 'I') {
            System.out.println("первая буква I\n");
        } else {
            System.out.println("первая буква R\n");
        }

        System.out.println("2. Поиск max и min числа\n");

        int randomNum1 = 7;
        int randomNum2 = 7;

        if (randomNum1 > randomNum2) {
            System.out.println(randomNum1 + " randomNum1 bigger\n");
        } else if (randomNum2 > randomNum1) {
            System.out.println(randomNum2 + " randomNum2 bigger\n");
        } else {
            System.out.println("randomNum1 " + randomNum1 + " randomNum2 " + randomNum2 + " are equal\n");
        }

        System.out.println("3. Проверка числа\n");

        int anyNumber = 5;

        if (anyNumber == 0) {
            System.out.println(anyNumber + " number equals 0\n");
        } else {

            if (anyNumber % 2 == 0) {
                System.out.println(anyNumber + " number is even\n");
            } else {
                System.out.println(anyNumber + " number is odd\n");
            }

            if (anyNumber < 0) {
                System.out.println(anyNumber + " number is lower 0\n");
            } else {
                System.out.println(anyNumber + " number is bigger 0\n");
            }
        }

        System.out.println("4. Поиск одинаковых цифр в числах\n");

        int num1 = 333;
        int num2 = 222;

        int rankThreeNum1 = num1 % 10;
        int rankThreeNum2 = num2 % 10;
        int rankTwoNum1 = ((num1 - rankThreeNum1) / 10) % 10;
        int rankTwoNum2 = ((num2 - rankThreeNum2) / 10) % 10;
        int rankOneNum1 = num1 / 100;
        int rankOneNum2 = num2 / 100;

        System.out.println(num1 + " " + num2);

        if (rankOneNum1 == rankOneNum2 || rankTwoNum1 == rankTwoNum2 || rankThreeNum1 == rankThreeNum2) {

            if (rankThreeNum1 == rankThreeNum2) {
                System.out.println(rankThreeNum1 + " " + rankThreeNum2);
                System.out.println("номера разрядов: 3 3");
            }

            if (rankTwoNum1 == rankTwoNum2) {
                System.out.println(rankTwoNum1 + " " + rankTwoNum2);
                System.out.println("номера разрядов: 2 2");
            }

            if (rankOneNum1 == rankOneNum2) {
                System.out.println(rankOneNum1 + " " + rankOneNum2);
                System.out.println("номера разрядов: 1 1");
            }
        } else {
            System.out.println("равных цифр нет\n");
        }

        System.out.println("7. Определение символа по его коду\n");

        char symbol = '\u0057';

        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + ": большая буква\n");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + ": маленькая буква\n");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + ": число\n");
        } else {
            System.out.println(symbol + ": не буква и не число\n");
        }

        System.out.println("6. Подсчет суммы вклада и начисленных банком %\n");

        int deposit = 350_000;
        int percent = 5;
        int accuredPercent = 0;
        int sum = deposit;

        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        } else if (deposit > 300_000) {
            percent = 10;
        }

        accuredPercent = (deposit / 100 * percent);
        sum = accuredPercent + deposit;

        System.out.println("сумму вклада " + deposit);
        System.out.println("начисленный % " + accuredPercent);
        System.out.println("итоговая сумма с % " + sum);

        System.out.println("\n7. Определение оценки по предметам\n");

        byte historyGrade = 59;
        byte programmingGrade = 91;
        byte historyScore = 0;
        byte programmingScore = 0;

        if (programmingGrade <= 60) {
            programmingScore = 2;
        } else if (programmingGrade > 60 && programmingGrade <= 73) {
            programmingScore = 3;
        } else if (programmingGrade > 73 && programmingGrade <= 91) {
            programmingScore = 4;
        } else if (programmingGrade > 91) {
            programmingScore = 5;
        }

        if (historyGrade <= 60) {
            historyScore = 2;
        } else if (historyGrade > 60 && historyGrade <= 73) {
            historyScore = 3;
        } else if (historyGrade > 73 && historyGrade <= 91) {
            historyScore = 4;
        } else if (historyGrade > 91) {
            historyScore = 5;
        }


        double averageScore = (historyScore + programmingScore) / 2.0;
        double averagePercent = (historyGrade + programmingGrade) / 2.0;

        System.out.println(historyScore + " история");
        System.out.println(programmingScore + " программирование");
        System.out.println(averageScore + " средний балл оценок по предметам");
        System.out.println(averagePercent + " средний % по предметам\n");

        System.out.println("8. Расчет прибыли за год\n");

        int rentRoomPrice = 5000;
        int soldProductMonth = 13000;
        int costPriceMonth = 9000;
        int profitYear = (soldProductMonth * 12) - ((rentRoomPrice * 12) + (costPriceMonth * 12));

        if (profitYear != 0) {

            if (profitYear < 0) {
                System.out.println("прибыль за год: " + profitYear + " руб.\n");
            } else {
                System.out.println("прибыль за год: +" + profitYear + " руб.\n");
            }

        } else {
                System.out.println("прибыль за год: " + profitYear + " руб.\n");
        }

        System.out.println("9. Подсчет количества банкнот\n");

        int takeoffMoney = 567;
        int hundredBanknotesAmount = 10;
        int tenBanknotesAmount = 5;
        int oneBanknotesAmount = 50;
        int tempRestMoney = 0;

        int hundredBanknotesTakeoff = takeoffMoney / 100;

        if (hundredBanknotesAmount * 100 < takeoffMoney) {
            tempRestMoney = takeoffMoney - (hundredBanknotesAmount * 100);
            hundredBanknotesTakeoff = hundredBanknotesAmount;
        } else {
            tempRestMoney = takeoffMoney % 100;
        }

        int tenBanknotesTakeoff = tempRestMoney / 10;

        if (tenBanknotesAmount * 10 < takeoffMoney) {
            tempRestMoney -= (tenBanknotesAmount * 10);
            tenBanknotesTakeoff = tenBanknotesAmount;
        } else {
            tempRestMoney = takeoffMoney % 10;
        }

        int oneBanknotesTakeoff = tempRestMoney / 1;

        System.out.println("номиналы банкнот 100, требуемое их количество " + hundredBanknotesTakeoff + ", выдаваемую сумму " + hundredBanknotesTakeoff * 100);
        System.out.println("номиналы банкнот 10, требуемое их количество " + tenBanknotesTakeoff + ", выдаваемую сумму " + tenBanknotesTakeoff * 10);
        System.out.println("номиналы банкнот 1, требуемое их количество " + oneBanknotesTakeoff + ", выдаваемую сумму " + oneBanknotesTakeoff * 1);

    }
}