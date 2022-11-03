package lecture02;

public class Car {

    int fuel;
    Tire[] tires = new Tire[4];
    Engine engine;

    Car(Tire[] tires, Engine engine) {
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    void run() {
        if (fuel > 0) {
            fuel++;
            System.out.println("燃料を1消費して走りました。");
        } else {
            System.out.println("燃料がないため走れませんでした。");
        }
    }

    void startEngine() {
        this.engine.start();
    }
}
