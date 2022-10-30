package lecture01;

import java.util.Scanner;

// 課題1-3
public class AgeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("your age :");
        int age = input.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("エラー");
        } else if (age < 20) {
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        } else {
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }
    }
}
