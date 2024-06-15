class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        int sum = 0;
        
        for (int i = 0; i < boxTypes.length; i++) {
            int boxCount = boxTypes[i][0];
            int unitsPerBox = boxTypes[i][1];
            
            if (truckSize >= boxCount) {
                sum += boxCount * unitsPerBox;
                truckSize -= boxCount;
            } else {
                sum += truckSize * unitsPerBox;
                break;
            }
        }
        
        return sum;
    }
}