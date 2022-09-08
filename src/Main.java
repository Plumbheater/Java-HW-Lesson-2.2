public class Main {
    public static void main(String[] args) {

        int bank = 233; // остаток на счету
        int paid = 1090; // сумма пополнения

        int bonus;
        if (paid < 1000) {
            bonus = 0;
        } else {
            bonus = paid / 100;
        }
        System.out.println("Бонус начисления: " + bonus);
        System.out.println("Итоговая сумма: " + (paid + bonus));
        System.out.println("Остаток на счете: " + (bank + paid + bonus));

    }
}