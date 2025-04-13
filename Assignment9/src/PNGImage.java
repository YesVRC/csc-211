public class PNGImage extends MyImage implements IMySaveable {
    public PNGImage(int witdh, int height) {
        super(witdh, height);
    }

    @Override
    public void load(String filename) {
        System.out.println("Loading PNG from " + filename);
    }

    @Override
    public void save(String filename) {
        System.out.println("Saving PNG to " + filename);
    }

    @Override
    public void printType() {
        System.out.println("PNG");
    }
}
