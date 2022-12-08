package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0;i < 5;i++) {
            arrayList.add(i, random.nextInt(6) + 1);
        }

        System.out.println("さいころを5つ振りました.");

        try {
            System.out.print("何番目のさいころの値を確認しますか？:");
            int index = input.nextInt();
            System.out.println(arrayList.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
        } catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました.");
            System.out.println("プログラムを終了します.");
        }


    }
}
