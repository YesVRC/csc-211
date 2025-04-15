package interfaceexample;

public interface IDriveable {
    enum Direction {
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
    public void move(Direction direction, int distance);
    public void stop();
    public void printDistance();
}
