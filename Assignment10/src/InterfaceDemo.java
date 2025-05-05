import interfaceexample.Boat;
import interfaceexample.Car;
import interfaceexample.IDriveable;

public class InterfaceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();

        IDriveable[] driveables = {
                car,
                boat
        };

        for(IDriveable driveable : driveables){
            driveable.move(IDriveable.Direction.UP, 10);
            driveable.stop();
            driveable.printDistance();
            System.out.println();
        }
    }
}
