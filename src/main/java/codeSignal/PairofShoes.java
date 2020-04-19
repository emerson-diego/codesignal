package codeSignal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PairofShoes {

    public static void main(String[] args) {

        int[][] shoes = { { 1, 21 }, { 1, 54 }, { 0, 65 }, { 1, 4 }, { 0, 93 }, { 0, 74 }, { 0, 25 }, { 0, 70 },
                { 1, 11 }, { 1, 35 }, { 1, 7 }, { 0, 6 }, { 0, 46 }, { 1, 45 }, { 0, 26 }, { 0, 62 }, { 1, 59 },
                { 0, 7 }, { 0, 28 }, { 1, 34 }, { 0, 4 }, { 1, 93 }, { 0, 89 }, { 1, 61 }, { 0, 90 }, { 0, 29 },
                { 1, 72 }, { 1, 52 }, { 1, 87 }, { 1, 70 }, { 1, 17 }, { 1, 85 }, { 0, 52 }, { 1, 79 }, { 1, 61 },
                { 1, 40 }, { 0, 70 }, { 1, 21 }, { 0, 49 }, { 1, 17 }, { 1, 6 }, { 0, 54 }, { 0, 10 }, { 1, 29 },
                { 1, 4 }, { 1, 58 }, { 0, 63 }, { 0, 73 }, { 1, 2 }, { 0, 87 }, { 1, 65 }, { 0, 2 }, { 0, 4 },
                { 1, 70 }, { 0, 72 }, { 1, 73 }, { 1, 74 }, { 1, 10 }, { 0, 11 }, { 0, 79 }, { 0, 17 }, { 0, 17 },
                { 0, 21 }, { 0, 21 }, { 0, 85 }, { 1, 25 }, { 1, 89 }, { 1, 26 }, { 1, 90 }, { 1, 28 }, { 0, 34 },
                { 0, 35 }, { 0, 40 }, { 0, 45 }, { 1, 46 }, { 1, 49 }, { 0, 58 }, { 0, 59 }, { 0, 61 }, { 0, 61 },
                { 1, 62 }, { 1, 63 } };

        boolean result = pairOfShoes(shoes);

        System.out.println(result);
    }

    static boolean pairOfShoes(int[][] shoes) {

        Map<Integer, List<Integer>> map = new HashMap();

        for (int i = 0; i < shoes.length; i++) {
            for (int j = 0; j < shoes[i].length; j += 2) {

                var value = shoes[i][j];
                var key = shoes[i][j + 1];

                if (map.get(key) != null) {

                    var list = map.get(key);
                    var findPair = false;

                    if (list.get(0) != value) {

                        if (list.size() == 1) {
                            map.remove(key);
                        } else {
                            list.remove(list.get(0));
                            map.replace(key, list);

                        }

                        findPair = true;
                        break;

                    }

                    if (!findPair) {

                        list.add(value);
                        map.replace(key, list);

                    }

                } else {
                    var list = new ArrayList();
                    list.add(value);
                    map.put(key, list);

                }
            }
        }

        if (map.isEmpty()) {
            return true;
        }
        return false;
    }

}