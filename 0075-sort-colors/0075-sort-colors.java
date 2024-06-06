class Solution {
    public void sortColors(int[] nums) {
        //[2,0,2,1,1,0]
        for(int i=0;i<nums.length;i++){
            int temp = 0;
            for(int j=i+1;j<nums.length;j++){

                if(nums[i]>nums[j]){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        } 
    }
}