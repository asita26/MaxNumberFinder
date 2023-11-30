public class MaxNumberFinder {
    public static Integer findMax(Integer a, Integer b, Integer c) {
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
        Integer max2 = findMax(1, 8, 4);
        System.out.println("Test Case 2: Max Number at 2nd position - Max Number: " + max2);

        // Test Case 3: Max Number at 3rd position
        Integer max3 = findMax(2, 4, 9);
        System.out.println("Test Case 3: Max Number at 3rd position - Max Number: " + max3);
    }
}
