package lecture02;

public class Car {

    int fuel;

    Car() {
        this.fuel = 0;
    }

    void run() {
        if (fuel > 0) {
            fuel++;
            System.out.println("燃料を1消費して走りました。");
        } else {
            System.out.println("燃料がないため走れませんでした。");
        }
    }
}
