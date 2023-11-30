public class MaxFinder<T extends Comparable<T>> {
    private T var1;
    private T var2;
    private T var3;

    public MaxFinder(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T testMaximum() {
        return findMax(var1, var2, var3);
    }

    public static <U extends Comparable<U>> U findMax(U a, U b, U c) {
        if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
            return a;
        } else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Max Number at 1st position
        MaxFinder<Integer> maxFinder1 = new MaxFinder<>(5, 3, 2);
        System.out.println("Test Case 1: Max Number at 1st position - Max Number: " + maxFinder1.testMaximum());

        // Test Case 2: Max Number at 2nd position
        MaxFinder<Float> maxFinder2 = new MaxFinder<>(1.7f, 8.5f, 4.2f);
        System.out.println("Test Case 2: Max Number at 2nd position - Max Number: " + maxFinder2.testMaximum());

        // Test Case 3: Max String at 3rd position
        MaxFinder<String> maxFinder3 = new MaxFinder<>("Cherry", "Blueberry", "Strawberry");
        System.out.println("Test Case 3: Max String at 3rd position - Max String: " + maxFinder3.testMaximum());
    }
}
