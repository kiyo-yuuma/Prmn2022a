package lecture01;

// 課題1-4
public class ArrayEvenSum {

    public static void main(String[] args) {

        int[] array = new int[100];

        // arrayにindex+1の値をarray[index]に代入する
        // 初期値・条件式・インクリメントをまとめて記述したいためfor文を用いた
        for (int i = 0;i < array.length;i++) {
            array[i] = i + 1;
        }

        int sum = 0;

        // arrayのindexが偶数であるものの値の合計を算出する
        // 配列の値を用いるため拡張for文を使用した
        for (int x: array) {
            if ((x - 1) % 2 == 0) {
                sum += x;
            }
        }

        System.out.println("sum = " + sum);
    }
}
