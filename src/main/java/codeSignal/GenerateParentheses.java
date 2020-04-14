package codeSignal;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        int n = 2;

        String[] result = generateParentheses(n);
        for (String s : result) {
            System.out.println(s);
        }

    }

    static String[] generateParentheses(int n) {
        List<String> outputArray = new ArrayList();
        track(outputArray, "", 0, 0, n);

        return outputArray.stream().toArray(String[]::new);

    }

    static void track(List<String> outputArray, String currentString, int open, int close, int max) {
        if (currentString.length() == max * 2) {
            outputArray.add(currentString);
            return;
        }
        if (open < max)
            track(outputArray, currentString + "(", open + 1, close, max);
        if (close < open)
            track(outputArray, currentString + ")", open, close + 1, max);

    }

}