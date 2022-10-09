public class Main {
    public static void main(String[] args) {

        int account = 200;
        int transfer = 100;

        int bonus = transfer / 100;
        if (transfer > 1000) {
            bonus = transfer / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Счет: " + (account + transfer + bonus) + " рублей");
        System.out.println("Сумма пополнения: " + transfer + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        //
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}