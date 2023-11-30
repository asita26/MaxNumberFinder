public class MaxNumberFinder {
    public static Float findMax(Float a, Float b, Float c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Max Number at 1st position
        Float maxFloat1 = findMax(5.2f, 3.1f, 2.9f);
        System.out.println("Test Case 1: Max Number at 1st position - Max Number: " + maxFloat1);

        // Test Case 2: Max Number at 2nd position
        Float maxFloat2 = findMax(1.7f, 8.5f, 4.2f);
        System.out.println("Test Case 2: Max Number at 2nd position - Max Number: " + maxFloat2);

        // Test Case 3: Max Number at 3rd position
        Float maxFloat3 = findMax(2.3f, 4.6f, 9.1f);
        System.out.println("Test Case 3: Max Number at 3rd position - Max Number: " + maxFloat3);
    }
}
