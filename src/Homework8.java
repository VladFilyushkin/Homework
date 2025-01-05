import java.lang.reflect.Array;
import java.util.*;
import java.util.HashMap;
import java.util.function.BiFunction;

public class Homework8 {
    public static <K> Map<K, Integer> countValues(K[] ks) {
        Map<K, Integer> map = new HashMap<K, Integer>();
        Set objectSet = new HashSet(Arrays.asList(ks));
        Iterator<K> objectIterator = objectSet.iterator();
        while (objectIterator.hasNext()) {
            K k = objectIterator.next();
            int counter = 0;
            for (int i = 0; i < ks.length; i++) {
                if (k.equals(ks[i])) {
                    counter++;
                }
            }
            map.put(k, counter);

        }
        return map;
    }

    public static void main(String[] args) {
        Integer[] integerArray = new Integer[]{1,2,3,1,2,3,4,5,6,7,7};

        System.out.println(countValues(integerArray));
    }
}
