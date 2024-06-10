
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        
        // A max-heap where elements are stored as (value, index)
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        
        for (int i = 0; i < n; i++) {
            // Add the current element to the heap
            maxHeap.offer(new int[]{nums[i], i});
            
            // Remove the elements from the heap that are outside the current window
            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }
            
            // The maximum element for the current window is at the root of the heap
            if (i >= k - 1) {
                result[i - k + 1] = maxHeap.peek()[0];
            }
        }
        
        return result;
    }
}
