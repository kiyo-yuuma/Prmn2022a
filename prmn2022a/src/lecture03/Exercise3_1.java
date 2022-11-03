package lecture03;

import java.util.Scanner;

public class Exercise3_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("任意の文字列を入力してください:");

        // 文字列を1行分取得、strに格納
        String str = scan.nextLine();

        System.out.println("“" + str + "” と入力されました");
    }
}
