package abstractexample;

public abstract class Driveable {
    int fuel;
    String engine;
    String model;

    public Driveable(int fuel, String engine, String model){
        this.fuel = fuel;
        this.engine = engine;
        this.model = model;
    }

    public abstract void print();
    public abstract void consumeFuel(int amt);
    public abstract void changeEngine(String engine);

    public String toString() {
        return String.format("%s with %d fuel (%s)", model, fuel, engine);
    }

}
