class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length, c = 0;
        HashSet<Integer> arr = new HashSet<>();
        
        if (size <= 1) {
            return size;
        } else {
           
            for (int i = 0; i < nums.length; i++) {
               arr.add(nums[i]);
            }
            Iterator<Integer> it = arr.iterator();
            while(it.hasNext()){
                nums[c++]=it.next().intValue();
                
            }
            Arrays.sort(nums,0,c);
            return c;
        }
    }
}