import java.util.Random;

public class Main {
    /**
     * This collection of methods and classes represents an image manipulation library.
     * Many of the actual functionality isn't implemented but structured in order to satisfy requirements.
     * MyImage is the base image class which implements IMySaveable, and MP3Audio is a standalone class that implements IMySaveable
     * Inheritance is for the images (MyImage -> PNGImage and JPGImage)
     * Composition is for the Interface IMySaveable in MyImage and MP3Audio
     * Polymorphism is the IMySaveable array which can accept multiple object types
     */
    public static void main(String[] args) {
        IMySaveable[] saveables = new IMySaveable[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            switch (r.nextInt() % 3){
                case 0:
                    saveables[i] = new JPGImage(100, 100);
                    break;
                case 1:
                    saveables[i] = new PNGImage(100, 100);
                    break;
                case 2:
                    saveables[i] = new MP3Audio();
                    break;
                default:
                    saveables[i] = new MyImage(100, 100);
                    break;
            }
        }
        for (IMySaveable saveable : saveables) {
            saveable.printType();

        }
    }
}