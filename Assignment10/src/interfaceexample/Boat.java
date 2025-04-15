package interfaceexample;

public class Boat implements IDriveable{
    private int miles = 0;

    @Override
    public void move(Direction direction, int distance) {
        this.miles += distance * 3;
        System.out.println("Moved Boat " + direction.name());
    }

    @Override
    public void stop() {
        System.out.println("Stopped Boat");
    }

    @Override
    public void printDistance() {
        System.out.println("Boat has moved " + miles + " nautical miles;");
    }
}
