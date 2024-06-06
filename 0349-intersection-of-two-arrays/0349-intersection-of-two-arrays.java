import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        ArrayList<Integer> numAL = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (hashmap.containsKey(nums1[i])) {
                hashmap.put(nums1[i], hashmap.get(nums1[i]) + 1);
            } else {
                hashmap.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hashmap.containsKey(nums2[i])) {
                numAL.add(nums2[i]);

                hashmap.remove(nums2[i]);

            }
        }
        int[] ans = new int[numAL.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = numAL.get(i);
        }
        return ans;
    }
}