public class MaxFinder {
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
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
        Integer max1 = findMax(5, 3, 2);
        System.out.println("Test Case 1: Max Number at 1st position - Max Number: " + max1);

        // Test Case 2: Max Number at 2nd position
        Float max2 = findMax(1.7f, 8.5f, 4.2f);
        System.out.println("Test Case 2: Max Number at 2nd position - Max Number: " + max2);

        // Test Case 3: Max String at 3rd position
        String max3 = findMax("Cherry", "Blueberry", "Strawberry");
        System.out.println("Test Case 3: Max String at 3rd position - Max String: " + max3);
    }
}
