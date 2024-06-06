import java.util.HashSet;
class Solution {
    public int firstMissingPositive(int[] nums) {
        int c=0;
        HashSet<Integer> h =new HashSet<>();//o(n)
        int [] arr = new int[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            h.add(nums[i]);
        }
        for(int i=1 ;i<arr.length;i++){
            if(!h.contains(i)){
               
                return i;
            } 
             c=i;
        }
        return c+1;

    }
}