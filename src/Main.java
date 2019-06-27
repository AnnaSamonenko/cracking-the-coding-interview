import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair {
    int x;
    int y;

    public Pair(int a, int b) {
        this.x = a;
        this.y = b;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Main {

    public static int MAX = 100;

    public static void main(String[] args) {
        Map<Integer, List<Pair>> map = new HashMap<>();

        for (int a = 0; a < MAX; a++) {
            for (int b = a; b < MAX; b++) {
                int sum = (int) Math.pow(a, 3) + (int) Math.pow(b, 3);
                List<Pair> list;
                if (map.containsKey(sum)) {
                    list = map.get(sum);
                } else {
                    list = new ArrayList<>();
                }
                list.add(new Pair(a, b));
                map.put(sum, list);
            }
        }

        for (Integer key : map.keySet()) {
            List<Pair> list = map.get(key);
            if (list.size() > 1) {
                System.out.println("Sum:" + key);
                for (Pair pair : list) {
                    System.out.println(pair);
                }
                System.out.println("----------");
            }
        }
    }

}
