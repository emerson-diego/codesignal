package codeSignal;

public class ArrayPacking {

    public static void main(String[] args) {
        int[] a = { 24, 85, 0 };
        int result = arrayPacking(a);
        System.out.println(result);
    }

    static int arrayPacking(int[] a) {

        var R = "";
        for (int i : a) {
            R = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0') + R;
        }
        return Integer.parseInt(R, 2);

    }

}