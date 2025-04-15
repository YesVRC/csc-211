package abstractexample;

public class Car extends Driveable{
    public Car(int fuel, String engine){
        super(fuel, engine, "Car");
    }
    @Override
    public void print() {
        System.out.println("Car: " + this.toString());
    }

    @Override
    public void consumeFuel(int amt) {
        fuel -= amt;
    }

    @Override
    public void changeEngine(String engine) {
        this.engine = engine;
    }

}
