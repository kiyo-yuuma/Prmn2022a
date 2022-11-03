package lecture02;

public class Exercise2_2 {

    public static void main(String[] args) {
        Car car = new Car();
        GasStation gs = new GasStation();

        // fuel = 0 で run
        car.run();

        // 給油
        gs.refuel(car);

        // fuelを増やしたので再度run
        car.run();
    }
}
