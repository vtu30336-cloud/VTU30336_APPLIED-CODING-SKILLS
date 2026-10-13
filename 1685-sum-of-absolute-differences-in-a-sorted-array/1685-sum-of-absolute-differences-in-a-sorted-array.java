class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int leftSum = nums[i] * i - (i > 0 ? prefixSum[i - 1] : 0);
            int rightSum = (prefixSum[n - 1] - prefixSum[i]) - nums[i] * (n - 1 - i);
            result[i] = leftSum + rightSum;
        }

        return result;
    }
}