import java.util.Hashtable;
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charcount = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length();i++){
            charcount[s.charAt(i) - 'a']++;
            charcount[t.charAt(i) - 'a']--;
        }
        for(int i=0 ; i<charcount.length;i++){
            if(charcount[i]!=0){
                return false;
            }
        }
        return true;
    }
}
 