public class Main {
    public static void main(String[] args) {

        int money = 1001; //сумма пополнения
        int startCheck = 100; //начальный счёт
        int bonus; //количество начисленных бонусов
        int summCheck; //итоговая сумма на счету клиента

        if (money <= 1000) {
            bonus = 0;
            summCheck = money + startCheck;
        } else {
            bonus = money / startCheck;
            summCheck = money + startCheck + bonus;
        }
        System.out.println("Количество начисленных бонусов:");
        System.out.println((bonus) + " рублей");
        System.out.println("Итоговая сумма на счету клиента:");
        System.out.println((summCheck) + " рублей");

    }
}
