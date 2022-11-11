package lecture04;

public class Exercise4_2 {

    public static void main(String[] args) {
        ATM atm = new ATM();

        String name = "〇〇";
        String number = "12345";

        atm.registerAccount(name, number);
        atm.registerAccount(name, number);

        long money = 1000;
        atm.deposit(number, money);

        money = 2000;
        atm.withdraw(number, money);

        money = 500;
        atm.withdraw(number, money);

    }
}
