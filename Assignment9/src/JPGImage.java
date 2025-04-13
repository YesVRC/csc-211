public class JPGImage extends MyImage {
    public JPGImage(int witdh, int height) {
        super(witdh, height);
    }

    @Override
    public void load(String filename) {
        System.out.println("Loading JPG from " + filename);
    }

    @Override
    public void save(String filename) {
        System.out.println("Saving JPG to " + filename);
    }

    @Override
    public void printType() {
        System.out.println("JPG");
    }
}
