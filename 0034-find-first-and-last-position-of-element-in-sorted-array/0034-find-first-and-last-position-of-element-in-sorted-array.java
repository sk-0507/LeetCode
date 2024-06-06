class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();
         int first = firstNumber(nums,target);
         int last;
         
         last=lastnumber(nums,target);
            dynamicArray.add(first);
            dynamicArray.add(last);
           int[] result = new int[dynamicArray.size()];
        for (int i = 0; i < dynamicArray.size(); i++) {
            result[i] = dynamicArray.get(i);
        }


         return result;
    }
    public int firstNumber(int[] arr,int target){
        int first = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
         int mid = (start+end)/2;
         if(arr[mid]==target){
            first = mid;
            end = mid-1;
         }else if(arr[mid]<target){
            start=mid+1;
         }else{
            end=mid-1;
         }
        }
        return first;
    }

    public int lastnumber(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int last = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                last=mid;
                start = mid+1;
            }else if(arr[mid]<target){
                start = mid + 1;

            }else{
                end = mid -1;
            }
        }
        return last;
    }
}