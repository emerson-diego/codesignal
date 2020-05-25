package codeSignal;

public class arrayMaxConsecutiveSum2 {

    public static void main(String[] args) {
        int[] a = { -3, -2, -1, -4 };
        int result = arrayMaxConsecutiveSum2(a);
        System.out.println(result);
    }

    static int arrayMaxConsecutiveSum2(int[] inputArray) {

        int size = inputArray.length; 
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            max_ending_here = max_ending_here + inputArray[i]; 
            if (max_so_far < max_ending_here) 
                max_so_far = max_ending_here; 
            if (max_ending_here < 0) 
                max_ending_here = 0; 
        } 
        return max_so_far; 

    }



}