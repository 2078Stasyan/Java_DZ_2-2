public class Main {
    public static void main(String[] args) {

        int money = 1100; //сумма пополнения
        int StartCheck = 100; //начальный счёт
        int bonus; //количество начисленных бонусов
        int SummCheck; //итоговая сумма на счету клиента

        if (money < 999) {
            bonus = 0;
            SummCheck = money + StartCheck;
        } else {
            bonus = money / StartCheck;
            SummCheck = money + StartCheck + bonus;
        }
        System.out.println("Количество начисленных бонусов:");
        System.out.println((bonus) + " рублей");
        System.out.println("Итоговая сумма на счету клиента:");
        System.out.println((SummCheck) + " рублей");

    }
}
