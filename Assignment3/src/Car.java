public class Car extends Automobile {


    public Car(String brand, String model, String year) {
        super(brand, model, year);
    }

    public Car() {
        super();
    }

    @Override
    public int compareTo(Automobile other) {
        if(other instanceof JunkCar) {
            return 1;
        }
        else if(other instanceof SportsCar){
            return -1;
        }
        else {
            return 0;
        }

    }

    @Override
    public void honk(){
        System.out.println("Car Honk Honk!");
    }

    @Override
    public void accelerate(){
        System.out.println("Car Accelerating!");
    }

    @Override
    public void stop(){
        System.out.println("Car Stopping!");
    }

    @Override
    public void reverse(){
        System.out.println("Car Reversing!");
    }

    @Override
    public String toString() {
        return "Type: Car, " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car){
            return super.equals(obj);
        }
        else return false;
    }
}
