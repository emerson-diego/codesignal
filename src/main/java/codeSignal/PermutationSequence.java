package codeSignal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class PermutationSequence {
    public static void main(String[] args) {
        permutationSequence(3, 3);
    }

    static String permutationSequence(int n, int k) {

        String string = "";
        List<String> lista = new ArrayList();

        for (int i = 1; i <= n; i++) {
             string = string + i;
         }

        permutation(lista, "", string);
        // for (String s : lista) {
        //     System.out.println(s);
        // }

        lista.sort(Comparator.comparing(String::toString));

        // for (String s : lista) {
        //     System.out.println(s);
        // }

        return lista.get(k);

    }

    private static void permutation(List<String> lista, String prefix, String str) {
    
        int n = str.length();
        if (n == 0)
            lista.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(lista, prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }
}
