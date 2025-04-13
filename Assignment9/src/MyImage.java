public class MyImage implements IMySaveable {
    private int[][] image;

    public MyImage(int witdh, int height) {
        this.image = new int[witdh][height];
    }

    public int[][] getImage() {
        return image;
    }
    public void setImage(int[][] image) {
        this.image = image;
    }
    public void setPixel(int x, int y, int value) {
        this.image[x][y] = value;
    }
    public int getPixel(int x, int y) {
        return this.image[x][y];
    }

    @Override
    public void load(String filename) {
        System.out.println("No image loaded");
    }

    @Override
    public void save(String filename) {
        System.out.println("No image saved");
    }

    @Override
    public void printType() {
        System.out.println("No Type");
    }
}
