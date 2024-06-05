import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i =0; i<nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                res[0]=i;
                res[1] =hash.get(nums[i]);
            } else {
                hash.put(target-nums[i], i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ans = new int[2];
        ans = twoSum(new int[]{2, 3, 7, 10}, 9);
        System.out.println(Arrays.toString(ans));
    }
}
