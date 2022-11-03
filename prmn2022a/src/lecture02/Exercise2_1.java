package lecture02;

public class Exercise2_1 {

    public static void main(String[] args) {
        Human[] human = new Human[2];

        human[0] = new Human("たかし", 18);
        human[1] = new Human("ひろし", 22);

        for (Human h : human) h.print();
    }
}
