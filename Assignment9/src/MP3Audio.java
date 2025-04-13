public class MP3Audio implements IMySaveable {

    private int[] samples;

    public MP3Audio() {
        this.samples = new int[1000];
    }

    public MP3Audio(int[] samples) {
        this.samples = samples;
    }

    public int[] getSamples() {
        return samples;
    }

    @Override
    public void load(String filename) {
        System.out.println("Loading MP3" + filename);
    }

    @Override
    public void save(String filename) {
        System.out.println("Saving MP3" + filename);
    }

    @Override
    public void printType() {
        System.out.println("MP3");
    }
}
