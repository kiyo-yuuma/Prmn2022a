package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // String型のArrayListを定義
        ArrayList<String> strings = new ArrayList<>();

        System.out.print("何行分入力しますか？ :");
        int line = scan.nextInt();

        // 改行コードを空読み
        scan.nextLine();

        for (int i = 0;i < line;i++) {
            System.out.print((i + 1) + "行目:");
            String str = scan.nextLine();
            strings.add(str);
        }

        int index = 0;
        System.out.println("入力した文字列:");

        // 拡張for文を用いて出力
        for (String str : strings) {
            System.out.println("[" + index++ + "] " + str);
        }
    }
}
