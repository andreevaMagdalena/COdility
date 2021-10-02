import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CountFactors {
    public static void main(String[] args) {
        int n = 1000000000;
        Set<Integer> factors = new LinkedHashSet<>();
        for (int i = 1; i < n + 1 ; i++) {
            if(n % i == 0){
                factors.add(i);
            }
        }
        System.out.println(factors);



    }
}
