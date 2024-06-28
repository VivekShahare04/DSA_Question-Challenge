class Solution {
    public int minOperations(String[] logs) {
        int operations=0;
        for(String log:logs){
            if(log.equals("../")){
                if(operations>0){
                    operations--;
                }
            }else if(!log.equals("./")){
                operations++;
            }
        }
        return operations;
    }
}