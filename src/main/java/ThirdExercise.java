import java.util.HashSet;
import java.util.Set;

public class ThirdExercise {
    public static void main(String[] args) {
        int[] num = {-3, -2, -1, 0, 3, 4};

        Set<Integer> numbers = new HashSet<>();

        for (int value : num) {
            numbers.add(Math.abs(value));
        }
        System.out.println(numbers.size());
    }
}
