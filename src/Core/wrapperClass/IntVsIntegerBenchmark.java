package Core.wrapperClass;

public class IntVsIntegerBenchmark {

    private static final int LIMIT = 1_000_000_000;

    public static void main(String[] args) {

        // Warm-up (important for JVM JIT optimization)
        for (int i = 0; i < 5; i++) {
            sumWithInt();
            sumWithInteger();
        }

        // Measure int
        long startInt = System.currentTimeMillis();
        sumWithInt();
        long endInt = System.currentTimeMillis();

        // Measure Integer
        long startInteger = System.currentTimeMillis();
        sumWithInteger();
        long endInteger = System.currentTimeMillis();

        System.out.println("Time taken with int     : " + (endInt - startInt) + " ms");
        System.out.println("Time taken with Integer: " + (endInteger - startInteger) + " ms");
    }

    private static void sumWithInt() {
        int sum = 0;
        for (int i = 0; i < LIMIT; i++) {
            sum += i;
        }
    }

    private static void sumWithInteger() {
        Integer sum = 0;
        for (int i = 0; i < LIMIT; i++) {
            sum += i; // auto-unboxing + auto-boxing on every iteration, Unboxing (Integer → int) , Boxing (int → Integer)
            // JVM Actually does , sum = Integer.valueOf(sum.intValue() + i);
        }
    }
}
