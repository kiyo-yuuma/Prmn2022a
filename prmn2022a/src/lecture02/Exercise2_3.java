package lecture02;

public class Exercise2_3 {

    public static void main(String[] args) {
        // Tire型の配列tiresをインスタンス化
        Tire[] tires = new Tire[4];
        for (int i = 0;i < tires.length;i++) {
            tires[i] = new Tire(65);
        }

        // Engine型のengineをインスタンス化
        Engine engine = new Engine(4000);

        Car car = new Car(tires, engine);
        GasStation gs = new GasStation();

        // 給油
        gs.refuel(car);

        // エンジン始動
        car.startEngine();

        // fuelを増やしたので再度run
        car.run();
    }
}
