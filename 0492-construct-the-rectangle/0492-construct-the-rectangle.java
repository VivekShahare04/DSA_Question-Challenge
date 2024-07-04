class Solution {
    public int[] constructRectangle(int area) {
        int[] dim = new int[2];
        int w = (int) Math.sqrt(area);
        while(area%w!=0){
            w--;
        }
        int l = area/w;
        dim[0] = l;
        dim[1]=w;
        return dim;
    }
}