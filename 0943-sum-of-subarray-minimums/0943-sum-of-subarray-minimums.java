class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1_000_000_007;

        int[] PLE = new int[n]; // Previous Less Element
        int[] NLE = new int[n]; // Next Less Element

        // Monotonic stack
        Deque<Integer> stack = new ArrayDeque<>();

        // Fill PLE
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            PLE[i] = (stack.isEmpty()) ? -1 : stack.peek();
            stack.push(i);
        }

        // Clear stack for reuse
        stack.clear();

        // Fill NLE
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            NLE[i] = (stack.isEmpty()) ? n : stack.peek();
            stack.push(i);
        }

        // Calculate the sum of subarray minimums
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long count = (long)(i - PLE[i]) * (NLE[i] - i);
            sum = (sum + arr[i] * count) % MOD;
        }

        return (int) sum;
    }
}
