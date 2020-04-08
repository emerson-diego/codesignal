
package codeSignal;

import java.util.HashMap;
import java.util.Map;

public class CommomCharacterCount2 {

    public static void main(String[] args) {
        String[] s = { "aabcc", "adcaa", "acdba" };
        int result = commonCharacterCount2(s);
        System.out.println(result);
    }

    static int commonCharacterCount2(String[] s) {

        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < s.length; i++) {

            Map<Character, Integer> mapTemp = new HashMap();

            for (char c : s[i].toCharArray()) {

                if (mapTemp.containsKey(c)) {
                    mapTemp.replace(c, mapTemp.get(c) + 1);

                } else {
                    mapTemp.put(c, 1);
                }

            }

            if (i == 0) {
                mapTemp.forEach((key, value) -> map.put(key, mapTemp.get(key)));
            } else {
                map.forEach((key, value) -> {

                    if (mapTemp.containsKey(key)) {
                        if (map.get(key) > mapTemp.get(key)) {
                            map.replace(key, mapTemp.get(key));
                        }
                    } else {
                        map.replace(key, 0);
                    }
                });
            }

        }

        return map.values().stream().reduce(0, Integer::sum);


    }

}