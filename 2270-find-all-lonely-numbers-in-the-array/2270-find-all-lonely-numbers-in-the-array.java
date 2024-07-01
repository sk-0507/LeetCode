class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums) map.put(ele,map.getOrDefault(ele,0)+1);
        for(int ele : nums){
            if(map.get(ele)>1 || map.containsKey(ele + 1) || map.containsKey(ele - 1)) continue;
            answer.add(ele);
        }
        return answer;

    }
}