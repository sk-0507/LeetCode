class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]==val){
                nums[i]=val^nums[i];
                count++;
            }
        }
        Arrays.sort(nums);
        int left = 0,right= nums.length - 1 ;
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]= temp;
            left++;
            right--;
        }
        

        return nums.length - count;
    }
}