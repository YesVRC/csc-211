public class SportsCar extends Automobile{


    public SportsCar(String brand, String model, String year) {
        super(brand, model, year);
    }

    public SportsCar() {
        super();
    }

    @Override
    public int compareTo(Automobile other) {
        if(other instanceof Car || other instanceof JunkCar) {
            return 1;
        }
        else if(other instanceof SportsCar){
            return 0;
        }
        else {
            return -1;
        }

    }

    @Override
    public void honk(){
        System.out.println("Sports Car Honk Honk!");
    }

    @Override
    public void accelerate(){
        System.out.println("Sports Car Accelerating!");
    }

    @Override
    public void stop(){
        System.out.println("Sports Car Stopping!");
    }

    @Override
    public void reverse(){
        System.out.println("Sports Car Reversing!");
    }

    @Override
    public String toString() {
        return "Type: Sports Car," + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SportsCar){
            return super.equals(obj);
        }
        else return false;
    }
}
