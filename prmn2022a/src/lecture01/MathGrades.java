package lecture01;

// 課題1-5
public class MathGrades {

    public static void main(String[] args) {

        int[] score = {41,85,72,38,80};

        for (int i = 0;i < score.length;i++) {
            System.out.printf("%d番 %d点 %s\n", i, score[i], grade(score[i]));
        }

        System.out.println("・・・・・");
        System.out.println("最高点:" + max(score) + "点");
        System.out.println("最低点:" + min(score) + "点");
        System.out.println("平均点:" + average(score) + "点");
        System.out.println("・・・・・");

    }

    // 最高点を返す
    static int max(int[] score) {
        int max = score[0];

        for (int s: score) {
            if (s > max) max = s;
        }

        return max;
    }

    // 最低点を返す
    static int min(int[] score) {
        int min = score[0];

        for (int s: score) {
            if (s < min) min = s;
        }

        return min;
    }

    // 平均点を返す
    static double average(int[] score) {
        double ave = 0;

        for (int s: score) {
            ave += s;
        }

        return ave / score.length;
    }

    // 得点から評定を返す
    static String grade(int score) {
        if (score >= 90) return "秀";
        else if (score >= 80) return "優";
        else if (score >= 70) return "良";
        else if (score >= 60) return "可";
        else return "不可";
    }
}
