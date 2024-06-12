class Solution {
    public int findPermutationDifference(String s, String t) {
    HashMap<Character,Integer> smap = new HashMap<>();
    HashMap<Character,Integer> tmap = new HashMap<>();
    if(s.length()==0 && t.length()==0){
        return 0;
    }
    for(int i = 0;i<s.length();i++){
        smap.put(s.charAt(i),i);
        tmap.put(t.charAt(i),i);
    }    
    int sum = 0;
    for(int i=0;i<s.length();i++){
       
        char ch = s.charAt(i);
        sum = sum + Math.abs(smap.get(ch) - tmap.get(ch));

    }
    return sum;
    }
}