
import java.util.ArrayDeque;
import java.util.Deque;


public class PhoneNumber {
    public static void main(String[] args) {
        String phone = "5-6-";
        Deque<Character> numbers = new ArrayDeque<>();
        for (int i = 0; i < phone.length() ; i++) {
            if(Character.isDigit(phone.charAt(i))){
                numbers.add(phone.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (numbers.size() > 0) {
            if(numbers.size() == 4){
                sb.append(numbers.removeFirst());
                sb.append(numbers.removeFirst());
                sb.append("-");
                sb.append(numbers.removeFirst());
                sb.append(numbers.removeFirst());
            }else if(numbers.size() == 2){
                sb.append(numbers.removeFirst());
                sb.append(numbers.removeFirst());
            }
            else {
                sb.append(numbers.removeFirst());
                sb.append(numbers.removeFirst());
                sb.append(numbers.removeFirst());
                if(numbers.size() != 0) {
                    sb.append("-");
                }
            }
        }
        System.out.println(sb);
    }
}
