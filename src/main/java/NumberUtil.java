import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class NumberUtil {
    public static int generateNumber() {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();

        while (set.size() < 3) {
            set.add(random.nextInt(9) + 1);
        }

        int number = 0;
        int n = 100;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            number += iterator.next() * n;
            n /= 10;
        }

        return number;
    }
}