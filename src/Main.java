public class Main {
    public static void main(String[] args) {

        int balance = 100; // изначальный баланс на телефона
        int pluse = 1100; // пополнение баланса
        int bonus; // количество начисленных бонусов
        if (pluse > 1000) {
            bonus = pluse / 100;
        } else {
            bonus = 0;
        }
        int totalbalance = balance + pluse + bonus;
        System.out.println(("Ваш баланс: ") + totalbalance);
    }
}
