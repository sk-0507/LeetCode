class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "";
        String w2 = "";

        for (int i = 0; i < word1.length; i++) {
            w1 += word1[i];
           
        }
        for (int i = 0; i < word2.length; i++) {

            w2 += word2[i];
        }
        return w1.equals(w2);
    }
}