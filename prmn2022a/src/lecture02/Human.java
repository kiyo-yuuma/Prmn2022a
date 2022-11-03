package lecture02;

public class Human {

    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        String s = "";
        if (this.age <= 18) {
            s = "生徒:";
        } else if (this.age <= 22) {
            s = "学生:";
        }
        System.out.printf("%s%s %d歳です。\n", s, this.name, this.age);
    }
}
