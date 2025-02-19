import java.util.Random;

public class Tester {
    Automobile[] tests;

    public Tester(int amount) {
        tests = new Automobile[amount];
        Random rand = new Random();
        for (int i = 0; i < amount; i++) {
            int type = rand.nextInt(3);
            if (type == 0) {
                tests[i] = new Car();
            }
            if (type == 1) {
                tests[i] = new SportsCar();
            }
            if (type == 2) {
                tests[i] = new JunkCar();
            }
        }
    }

    public void TestHonk(){
        for (Automobile test : tests) {
            test.honk();
        }
    }

    public void TestAccelerate(){
        for (Automobile test : tests) {
            test.accelerate();
        }
    }

    public void TestReverse(){
        for (Automobile test : tests) {
            test.reverse();
        }
    }

    public void TestStop(){
        for (Automobile test : tests) {
            test.stop();
        }
    }

    public void TestString(){
        for (Automobile test : tests) {
            System.out.println(test.toString());
        }
    }

    // Modulo to avoid out of bounds plus easy wrap around

    public void TestCompare(){
        System.out.println("~~~~~ Self ~~~~~");
        System.out.printf("%s : %s --- %d\n",
                tests[0].getClass().getSimpleName(),
                tests[0].getClass().getSimpleName(),
                tests[0].compareTo(tests[0]));

        System.out.println("~~~~~ Other ~~~~~");
        for (int i = 0; i < tests.length; i++) {
            int next = (i + 1) % tests.length;
            System.out.printf("%s : %s --- %d\n",
                    tests[i].getClass().getSimpleName(),
                    tests[next].getClass().getSimpleName(),
                    tests[i].compareTo(tests[next]));
        }


    }

    public void TestEquals(){
        System.out.println("~~~~~ Self ~~~~~");
        System.out.printf("%s : %s --- %b\n",
                tests[0].getClass().getSimpleName(),
                tests[0].getClass().getSimpleName(),
                tests[0].equals(tests[0]));

        int trues = 0;
        System.out.println("~~~~~ Other ~~~~~");
        for (int i = 0; i < tests.length; i++) {

            int next = (i + 1) % tests.length;
            boolean equals = tests[i].equals(tests[next]);

            System.out.printf("%s : %s --- %b\n",
                    tests[i].getClass().getSimpleName(),
                    tests[next].getClass().getSimpleName(),
                    equals);

            if (equals) {
                trues++;
            }
        }

        System.out.printf("~~~~~ Results: %d / %d\n ~~~~~", trues, tests.length);
    }
}
