import java.util.*;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> numbers = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        if (maxOccurrences<1) return new int[0];
        for (int i : elements) {
            if (numbers.containsKey(i) && numbers.get(i)<maxOccurrences-1){
                result.add(i);
                numbers.put(i,numbers.get(i)+1);
            }else if (!numbers.containsKey(i)){
                result.add(i);
                numbers.put(i,0);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}