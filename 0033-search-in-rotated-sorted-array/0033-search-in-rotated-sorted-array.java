import java.util.HashSet;
class Solution {

    public int search(int[] nums, int target) {
          HashSet<Integer> h = new HashSet<>();
          h.add(target);
          for(int i = 0;i<nums.length;i++){
            if(!h.add(nums[i])){
                return i;
            }
          }
          return -1;
    }
}
 