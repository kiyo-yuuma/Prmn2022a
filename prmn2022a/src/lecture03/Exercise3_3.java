package lecture03;

import java.util.Scanner;

public class Exercise3_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strs = new String[2];

        for (int i = 0;i < strs.length;i++) {
            System.out.print((i + 1) + "つ目の整数を入力してください:");
            strs[i] = scan.nextLine();
        }

        // 文字列を整数に変換
        int x = Integer.parseInt(strs[0]);
        int y = Integer.parseInt(strs[1]);

        System.out.println(x + " + " + y + " = " + (x + y));
    }
}
