class Solution {
    public boolean isPlindrome(int i,int j,String s){
        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
    public String longestPalindrome(String s) {
        int start = 0,end=0,max=0;
        for(int i = 0; i<s.length();i++){
           
            for(int j = i;j<s.length();j++){
                if(isPlindrome(i,j,s)==true){
                   if((j-i+1)>max){
                    max = j-i+1;
                   
                    start = i;
                    end = j;
                   }
                }
            }
        }
        return s.substring(start,end+1);

    }
    
}