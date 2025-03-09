package test.java;

import main.java.MathMethods;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathMethodsTest {

    @Test
    public void add() {
        MathMethods m = new MathMethods(1, 2);
        assertEquals(3, m.add());
    }

    @ParameterizedTest
    @CsvSource({
            "1, 3",
            "3, 5",
            "5, 11"
    })
    public void average(int a, int b) {
        MathMethods m = new MathMethods(a, b);
        assertEquals((a + b) / 2, m.average());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void setA(int a) {
        MathMethods m = new MathMethods(0, 2);
        m.setA(a);
        assertEquals(a, m.getA());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void setB(int b) {
        MathMethods m = new MathMethods(0, 0);
        m.setB(b);
        assertEquals(b, m.getB());
    }

    @RepeatedTest(10)
    public void getA() {
        Random rand = new Random();
        int value = rand.nextInt(100);
        MathMethods m = new MathMethods(value, 2);
        assertEquals(value, m.getA());
    }

    @RepeatedTest(10)
    public void getB() {
        Random rand = new Random();
        int value = rand.nextInt(100);
        MathMethods m = new MathMethods(1, value);
        assertEquals(value, m.getB());
    }
}
