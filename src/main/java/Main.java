
import java.util.HashMap;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        int[] num = {2};
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int value : num) {
            if(elements.containsKey(value)){
                int el = elements.get(value);
                el++;
                elements.put(value, el);
            }else {
                elements.put(value, 1);
            }

        }
        Set<Integer> curr = elements.keySet();
        for (int value : curr) {
            if(elements.get(value) == 1){
                System.out.println(value);
                return;
            }
        }
    }
}
