package lecture04;

import java.util.ArrayList;
import java.util.List;

public class ATM {

    private ArrayList<Account> accountList;

    ATM() {
        this.accountList = new ArrayList<>();
    }

    public Account getAccount(String number) {
        for (Account account : this.accountList) {
            if (number.equals(account.getNumber())) {
                return account;
            }
        }
        return null;
    }

    public void registerAccount(String name, String number) {
        if (existsAccount(name, number)) {
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
        } else {
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
            this.accountList.add(new Account(name, number));
            System.out.println(name + " さんのアカウントを口座番号:" + number + " で登録しました。");
        }
    }

    public boolean existsAccount(String name, String number) {
        for (Account account : this.accountList) {
            if (name.equals(account.getName()) && number.equals(account.getNumber())) {
                return true;
            }
        }
        return false;
    }

    public void deposit(String number, long money) {
        Account account = getAccount(number);

        if (account == null) {
            System.out.println("口座番号:" + number + " は存在しません。");
            return;
        }

        account.addBalance(money);
        System.out.println("口座番号:" + number + " に " + money + " 円入金しました。");
    }

    public void withdraw(String number, long money) {
        Account account = getAccount(number);

        if (account == null) {
            System.out.println("口座番号:" + number + " は存在しません。");
            return;
        }

        if (account.getBalance() - money < 0) {
            System.out.print("口座番号:" + number + " から " + money + " 円引き出せませんでした。");
            System.out.println("残高:" + account.getBalance() + "円です。");
            return;
        }

        account.addBalance(-money);
        System.out.print("口座番号:" + number + " から " + money + " 円引き出しました。");
        System.out.println("残高:" + account.getBalance() + "円です。");
    }
}
