public class MaxNumberFinder {
    public static String findMax(String a, String b, String c) {
        if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
            return a;
        } else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Max String at 1st position
        String maxString1 = findMax("Apple", "Peach", "Banana");
        System.out.println("Test Case 1: Max String at 1st position - Max String: " + maxString1);

        // Test Case 2: Max String at 2nd position
        String maxString2 = findMax("Orange", "Grapes", "Kiwi");
        System.out.println("Test Case 2: Max String at 2nd position - Max String: " + maxString2);

        // Test Case 3: Max String at 3rd position
        String maxString3 = findMax("Cherry", "Blueberry", "Strawberry");
        System.out.println("Test Case 3: Max String at 3rd position - Max String: " + maxString3);
    }
}
