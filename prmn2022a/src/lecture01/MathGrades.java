package lecture01;

// 課題1-5
public class MathGrades {

    public static void main(String[] args) {

        // メソッドがstaticではないためインスタンスを生成
        MathGrades mg = new MathGrades();

        int[] score = {41,85,72,38,80};

        for (int i = 0;i < score.length;i++) {
            System.out.printf("%d番 %d点 %s\n", i, score[i], mg.grade(score[i]));
        }

        System.out.println("・・・・・");
        System.out.println("最高点:" + mg.max(score) + "点");
        System.out.println("最低点:" + mg.min(score) + "点");
        System.out.println("平均点:" + mg.average(score) + "点");
        System.out.println("・・・・・");

    }

    int max(int[] score) {
        int max = score[0];

        for (int s: score) {
            if (s > max) max = s;
        }

        return max;
    }

    int min(int[] score) {
        int min = score[0];

        for (int s: score) {
            if (s < min) min = s;
        }

        return min;
    }

    double average(int[] score) {
        double ave = 0;

        for (int s: score) {
            ave += s;
        }

        return ave / score.length;
    }

    String grade(int score) {
        if (score >= 90) return "秀";
        else if (score >= 80) return "優";
        else if (score >= 70) return "良";
        else if (score >= 60) return "可";
        else return "不可";
    }
}
