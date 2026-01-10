import java.util.*;

public class majorityel{

public static int[] majority_el(int[] nums) {
    int n = nums.length;
    int[] result = new int[2];   // max 2 majority elements
    int id = 0;

    HashMap<Integer, Integer> hm = new HashMap<>();

    // Step 1: Count frequency
    for (int i = 0; i < n; i++) {
        if (hm.containsKey(nums[i])) {
            hm.put(nums[i], hm.get(nums[i]) + 1);
        } else {
            hm.put(nums[i], 1);
        }
    }


    for (Integer key : hm.keySet()) {
        if (hm.get(key) > n / 3) {
            result[id++] = key;
        }
    }

    return result;
}

    public static void main(String[] args){
    int[] nums = {1, 1, 1, 2, 2, 3};

        int[] result = majority_el(nums);

        System.out.println("Majority elements (> n/3):");

        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {   // ignore empty slots
                System.out.print(result[i] + " ");
            }
        }
    }
}