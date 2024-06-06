class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length;
         
        while(start<end){
            int mid = (start + end)/2;
            if(nums[mid]==target){
                return  mid;
            }else if(nums[mid]<target){
                start++;
            }else{
                end--;
            }
        }
        return start;
       
    }
}