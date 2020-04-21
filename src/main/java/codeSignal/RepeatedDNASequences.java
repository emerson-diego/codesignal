package codeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedDNASequences {

    public static void main(String[] args) {

        String s = "GAGAGAGAGAGAG";
        String[] lista = repeatedDNASequences(s);
        for (String word : Arrays.asList(lista)) {
            System.out.println(word);
        }

    }

    static String[] repeatedDNASequences(String s) {

        List<String> list = new ArrayList();
        int count = 0;
        String word = "";

        for (int i = 0; i < (s.length() - 10); i++, count = 0, word = "") {

            while (count < 10) {
                word += s.charAt(i + count);
                count++;
            }

            String search1 = s.substring(0, i);
            String search2 = s.substring(i + 1, s.length());

            if (search1.contains(word) || search2.contains(word)) {
                if (!list.contains(word))
                    list.add(word);
            }

        }

        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

        String[] arr = new String[list.size()];

        return (String[]) list.toArray(arr);

    }

}