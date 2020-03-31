package codeSignal;

/**
 * Hello world!
 *
 */
public class ContainsNearbyAlmostDuplicateApp

{
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        int[] nums = { 2147483647, -2147483647 };
        boolean result = containsNearbyAlmostDuplicate(nums, 1, 2147483647);
        System.out.println(result);
    }

    static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

      

        for (int i = 0; i < nums.length - 1; i++) {
            int index = i + 1;
            while (index < nums.length) {

                long valueIndice = nums[index];
                if ((Math.abs(index - i) <= k) && (Math.abs(valueIndice - nums[i]) <= t)) {
                    return true;
                }
                index++;
            }
        }

        return false;

    }
}