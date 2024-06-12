class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelschar = new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            jewelschar.add(jewels.charAt(i));
        }
        int counter = 0;
        for(int i=0 ;i<stones.length();i++){
            if(jewelschar.contains(stones.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
}