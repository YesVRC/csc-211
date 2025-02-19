public class Main {

    // Probably overboard but I was having fun with it
    public static void main(String[] args) {
        System.out.println("Test Time!");
        Tester tests = new Tester(1000);

        System.out.println("===== Honk =====");
        tests.TestHonk();

        System.out.println("===== Accelerate =====");
        tests.TestAccelerate();

        System.out.println("===== Stop =====");
        tests.TestStop();

        System.out.println("===== Reverse =====");
        tests.TestReverse();

        System.out.println("===== ToString =====");
        tests.TestString();

        System.out.println("===== CompareTo =====");
        tests.TestCompare();

        System.out.println("===== Equals =====");
        tests.TestEquals();
    }


}

