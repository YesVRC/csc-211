import abstractexample.Boat;
import abstractexample.Car;
import abstractexample.Driveable;

public class AbstractDemo {
    public static void main(String[] args){
        Car car = new Car(100, "V8");
        Boat boat = new Boat(100, "Marine: V4");

        Driveable[] driveables = {
                car,
                boat
        };

        for (Driveable driveable : driveables){
            driveable.print();
        }
    }
}
