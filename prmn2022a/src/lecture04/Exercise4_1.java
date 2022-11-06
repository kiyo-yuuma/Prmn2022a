package lecture04;

public class Exercise4_1 {

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(250, 40, "Fighter1");
        Fighter fighter2 = new Fighter(200, 70, "Fighter2");

        while (true) {
            System.out.print(fighter1.getName() + " は " + fighter2.getName() + " に ");
            fighter1.attack(fighter2);
            System.out.println(fighter2.getName() + " は残り hitPoint : " + fighter2.getHitPoint());
            if (!fighter2.isAlive()) {
                System.out.println(fighter2.getName() + " は倒れた。");
                break;
            }

            System.out.print(fighter2.getName() + " は " + fighter1.getName() + " に ");
            fighter2.attack(fighter1);
            System.out.println(fighter1.getName() + " は残り hitPoint : " + fighter1.getHitPoint());
            if (!fighter1.isAlive()) {
                System.out.println(fighter1.getName() + " は倒れた。");
                break;
            }
        }
    }
}
