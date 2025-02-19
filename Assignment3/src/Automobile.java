import java.util.Random;

public class Automobile {
    private String brand;
    private String year;

    public Automobile(String brand, String model, String year) {
        this.brand = brand;
        this.year = year;
    }

    public Automobile() {
        Random rand = new Random();
        this.brand = generateBrand(rand);
        this.year = generateYear(rand);
    }

    public String generateYear(Random rand){
        return String.valueOf(rand.nextInt(1960, 2020));
    }

    public String generateBrand(Random rand){
        String[] brands = {
                "Chrystler",
                "Jeep",
                "Chevrolet",
                "Dodge",
                "Ford"
        };
        return brands[rand.nextInt(brands.length - 1)];
    }

    public void honk(){
        System.out.println("Honk Honk!");
    }

    public void accelerate(){
        System.out.println("Accelerating!");
    }

    public void stop(){
        System.out.println("Stopping!");
    }

    public void reverse(){
        System.out.println("Reversing!");
    }

    // What comparison to make isn't specified... I'm going with the type of car ( Junk < Car < Sport )
    public int compareTo(Automobile other){
        return -1;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, Year: %s", brand, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Automobile other) {

            return this.brand.equals(other.brand)
                    && this.year.equals(other.year);

        }
        return false;
    }
}
