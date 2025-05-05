package interfaceexample;

public class Car implements IDriveable{
    private int miles = 0;

    @Override
    public void move(Direction direction, int distance) {
        this.miles += distance;
        System.out.println("Moved Car " + direction.name());
    }

    @Override
    public void stop() {
        System.out.println("Stopped Car");
    }

    @Override
    public void printDistance() {
        System.out.println("Car has moved " + miles + " miles;");
    }
}
