import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer> intersectAL = new ArrayList<>();
        for(int i=0 ; i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i]) + 1);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        for(int i=0 ; i< nums2.length;i++){
            if(map.containsKey(nums2[i])){
                intersectAL.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i]) - 1);
                if(map.get(nums2[i])==0){
                    map.remove(nums2[i]);
                }
            }
        }
        int[] ans = new int[intersectAL.size()];
        for(int i = 0; i<ans.length;i++){
            ans[i]=intersectAL.get(i);
        } 
        return ans;
    }

}