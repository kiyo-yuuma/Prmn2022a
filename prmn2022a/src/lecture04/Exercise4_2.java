package lecture04;

public class Exercise4_2 {

    public static void main(String[] args) {
        ATM atm = new ATM();

        String name1 = "〇〇";
        String number1 = "12345";

        atm.registerAccount(name1, number1);
        atm.registerAccount(name1, number1);

        String name2 = "××";
        String number2 = "67890";

        atm.registerAccount(name2, number2);
        atm.registerAccount(name2, number2);

        long money = 1000;
        atm.deposit(number1, money);

        money = 3000;
        atm.deposit(number2, money);

        // 存在しないナンバー
        atm.deposit("13579", money);

        money = 2000;
        atm.withdraw(number1, money);

        money = 2000;
        atm.withdraw(number2, money);

        money = 500;
        atm.withdraw(number1, money);

    }
}
