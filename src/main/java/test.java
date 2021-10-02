import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        int[] num = {1,3};
        //find max number
        int number = 1;
        Arrays.sort(num);
        int max = num[num.length -1];
        Set<Integer> elements = new HashSet<Integer>();
        for (int value : num) {
            elements.add(value);
        }
            for (int i = 1; i <= max; i++) {
                if(!elements.contains(i))
                {
                    number = i;
                    break;
                }else {
                    number = max+1;
                }
            }

        System.out.println(number);

    }}
