public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сумму пополнения и узнаете итоговый счёт и количество бонусных рублей в нём.");
// Объявляете переменные для входных данных и
        int startBalance = 500;
// параметров программы: начального счёта,
        int addendum = 1235;
        // суммы пополнения и тп
        int bonus = 0;

        if (addendum > 1000) {
            bonus = addendum / 100;
        }
// Условным оператором проверяете, превысила ли сумма пополнения порог
        int finBalance = startBalance + addendum + bonus;
        //  и для этих двух разных сценариев рассчитываете сумму бонуса
        System.out.println(" Итоговый баланс : " + finBalance);
//   и выводите на экран.
        System.out.println(" Бонус : " + bonus);

    }

}