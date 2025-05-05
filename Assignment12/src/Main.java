public class Main {
    public static void main(String[] args) {
        int fibRec = FibonacciRecursive(10);
        int fibIter = FibonacciIterative(10);
        int decRec = Dec2BinRecursive(50);
        String decIter = Dec2BinIterative(50);

        System.out.println("Fibonacci Recursive: " + fibRec);
        System.out.println("Fibonacci Iterative: " + fibIter);
        System.out.println("Decimal To Binary Recursive: " + decRec);
        System.out.println("Decimal To Binary Iterative: " + decIter);
    }

    public static int FibonacciRecursive(int n){
        if (n <= 1){
            return n;
        }

        return FibonacciRecursive(n-1) + FibonacciRecursive(n-2);
    }

    public static int FibonacciIterative(int n){
        int[] fib = new int[n+1];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n-1];
    }

    public static int Dec2BinRecursive(int n){
        if (n == 0){
            return 0;
        }
        else {
            return (n % 2 + 10 * Dec2BinRecursive(n / 2));
        }
    }

    public static String Dec2BinIterative(int n){
        // Opted for StringBuilder as appending and reversing was easier this way
        StringBuilder output = new StringBuilder();
        while (n != 0) {
            output.append(n % 2);
            n = n / 2;
        }
        // Flip the output because it's in reverse
        return output.reverse().toString();
    }
}


