class Solution {
    public int scoreOfString(String s) {
        if(s.length()==0){
            return 0;
        }
         int[] asci = new int[s.length()];
        for(int i = 0 ; i< s.length(); i++){
            asci[i]=(int)s.charAt(i);
        }
        int sum = 0;
        for(int i =1 ; i<asci.length;i++){
            sum = sum + Math.abs(asci[i] - asci[i-1]);
        }
        return sum;
    }
}