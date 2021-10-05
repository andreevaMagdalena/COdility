import java.util.*;
import java.util.stream.Collectors;

public class WordsInArray {
    public static void main(String[] args) {
        String sentences = "we test codes . give as a try? ";
        List<String> words =  Arrays.stream(sentences.split("[.\\?!]")).collect(Collectors.toList());
        Map<List<String>, Integer> map = new HashMap<>();
        for (String s : words) {
            int count = 0;
            List<String> wordsCount  = Arrays.stream(s.split(" ")).collect(Collectors.toList());
            for (String value : wordsCount) {
                if(!value.equals("")) {
                    if (Character.isLetter(value.charAt(0))) {
                        count++;
                    }
                }
            }
            map.put(wordsCount, count);
        }
       int result = Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();
     System.out.println(result);









    }
}
