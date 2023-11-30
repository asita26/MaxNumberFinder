import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxFinder<T extends Comparable<T>> {
    private List<T> values;

    public MaxFinder(T... values) {
        this.values = Arrays.asList(values);
    }

    public T testMaximum() {
        T max = findMax(values);
        printMax(max);
        return max;
    }

    public static <U extends Comparable<U>> U findMax(U... values) {
        List<U> valueList = Arrays.asList(values);

        Optional<U> max = valueList.stream()
                .max(Comparable::compareTo);

        return max.orElse(null);
    }

    public static <V> void printMax(V max) {
        System.out.println("Maximum Value: " + max);
    }

    public static void main(String[] args) {
        // Test Case 1: Max Number at 1st position
        MaxFinder<Integer> maxFinder1 = new MaxFinder<>(5, 3, 2);
        maxFinder1.testMaximum();

        // Test Case 2: Max Number at 2nd position
        MaxFinder<Float> maxFinder2 = new MaxFinder<>(1.7f, 8.5f, 4.2f);
        maxFinder2.testMaximum();

        // Test Case 3: Max String at 3rd position
        MaxFinder<String> maxFinder3 = new MaxFinder<>("Cherry", "Blueberry", "Strawberry");
        maxFinder3.testMaximum();

        // Test Case 4: Max Number with more than three parameters
        MaxFinder<Double> maxFinder4 = new MaxFinder<>(3.5, 6.2, 8.9, 2.1, 5.7);
        maxFinder4.testMaximum();
    }
}
