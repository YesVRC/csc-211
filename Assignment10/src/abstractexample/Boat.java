package abstractexample;

public class Boat extends Driveable{
    public Boat(int fuel, String engine) {
        super(fuel, engine, "Boat");
    }

    @Override
    public void print() {
        System.out.println("Boat: " + this.toString());
    }

    @Override
    public void consumeFuel(int amt) {
        this.fuel -= amt + 3;
    }

    @Override
    public void changeEngine(String engine) {
        this.engine = "Marine: " + engine;
    }

}
