class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(int i =0;i<operations.length;i++){
            System.out.print(operations[i]);
              if(operations[i].equals("++X") || operations[i].equals("X++")) {
                value++;
            }else{
                value--;
            }
        }
        return value;
    }
}