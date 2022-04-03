package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.acc();
        car.brake();
        car.stop();

        Engine car1 = new Car();
        System.out.println(car1.a);

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.startMusic();

        niceCar.upgradeEngine();

        niceCar.start();
        niceCar.startMusic();

    }
}
