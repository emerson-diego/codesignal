package codeSignal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTable {

    public static void main(String[] args) {

        String table = "<table><tr><td>7BusWMJ</td><td>D</td><td>5QPh9o</td></tr><tr><td>4Z</td><td>9Z</td><td>okc3</td></tr><tr><td>7mV88j</td><td>K358zV8</td><td>Y2vE</td></tr></table>";
        String result = htmlTable(table, 1, 1);
        System.out.println(result);
    }

    static String htmlTable(String table, int row, int column) {

        Pattern pRow = Pattern.compile("<tr>.*?</tr>");
        Pattern pCol = Pattern.compile("<td>.*?</td>");
        Matcher mRow = pRow.matcher(table);

        int i = 0;
        int j = 0;
        while (mRow.find()) {

            String cols = mRow.group();
            Matcher mCol = pCol.matcher(cols);
            while (mCol.find()) {
                if (i == row && j == column)
                    return mCol.group().replace("<td>", "").replace("</td>", "");
                ++j;
            }
            j = 0;
            ++i;
        }

        return "No such cell";
    }

}