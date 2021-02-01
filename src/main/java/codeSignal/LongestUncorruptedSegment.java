package codeSignal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestUncorruptedSegment {

    public static void main(String[] args) {
        int[] sourceArray = { 33531593, 96933415, 28506400, 39457872, 29684716, 86010806 };
        int[] destinationArray = { 33531593, 96913415, 28506400, 39457872, 29684716, 86010806 };
        int[] result = new LongestUncorruptedSegment().longestUncorruptedSegment(sourceArray, destinationArray);
        System.out.println(result[0] + " " + result[1]);
    }

    int[] longestUncorruptedSegment(int[] sourceArray, int[] destinationArray) {

        int result[] = { 0, 0 };
        List<Integer> listaUncorrupted = new ArrayList<>();
        List<Integer> listaUncorruptedTemp = new ArrayList<>();

        for (int i = 0; i < sourceArray.length; i++) {

            if (sourceArray[i] == destinationArray[i]) {

                if (listaUncorruptedTemp.size() == 0) {
                    listaUncorruptedTemp.add(i);
                }

                listaUncorruptedTemp.add(sourceArray[i]);

            } else {

                if (listaUncorruptedTemp.size() > listaUncorrupted.size()) {
                    listaUncorrupted = listaUncorruptedTemp;

                }
                listaUncorruptedTemp = new ArrayList<>();

            }

        }

        if (listaUncorrupted.size() > 0 || listaUncorruptedTemp.size() > 0) {

            if (listaUncorrupted.size() >= listaUncorruptedTemp.size()) {
                result[0] = listaUncorrupted.size() - 1;
                result[1] = listaUncorrupted.get(0);
            } else {
                result[0] = listaUncorruptedTemp.size() - 1;
                result[1] = listaUncorruptedTemp.get(0);
            }
        }

        return result;

    }

}
