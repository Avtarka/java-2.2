public class Main {
    public static void main(String[] args) {

        int cheсkClient = 100; // сумма счёта клиента
        int addCash = 1100; // сумма зачисления

        boolean border = addCash > 1000; // порог 1000р.

        int bonus; // стоимость бонуса
        if (border) {
            bonus = addCash / 100;
        } else {
            bonus = 0;
        }
        int result = cheсkClient + addCash + bonus;

        System.out.println("Сума на счёту клиента - " + result + "р.");
        System.out.println("Сумма пополнения - " + addCash + "р.");
        System.out.println("Бонусы - " + bonus + "р.");
    }
}

// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете, превысила ли
// сумма пополнения порог, и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.