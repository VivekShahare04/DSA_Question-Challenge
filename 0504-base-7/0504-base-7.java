class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder str = new StringBuilder();
        boolean isnegative = num < 0;

        if(isnegative){
            num=-num;
        }

        while(num>0){
            str.append(num%7);
            num/=7;
        }

        if(isnegative){
            str.append("-");
        }

        return str.reverse().toString();
    }
}