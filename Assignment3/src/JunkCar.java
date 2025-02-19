public class JunkCar extends Automobile{


    public JunkCar(String brand, String model, String year) {
        super(brand, model, year);
    }

    public JunkCar() {
        super();
    }

    @Override
    public int compareTo(Automobile other) {
        if(other instanceof JunkCar){
            return 0;
        }
        else if(other instanceof SportsCar || other instanceof Car){
            return 1;
        }
        else {
            return -1;
        }

    }

    @Override
    public void honk(){
        System.out.println("Junk Car Honk Honk!");
    }

    @Override
    public void accelerate(){
        System.out.println("Junk Car Accelerating!");
    }

    @Override
    public void stop(){
        System.out.println("Junk Car Stopping!");
    }

    @Override
    public void reverse(){
        System.out.println("Junk Car Reversing!");
    }

    @Override
    public String toString() {
        return "Type: Junk Car, " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof JunkCar){
            return super.equals(obj);
        }
        else return false;
    }
}
