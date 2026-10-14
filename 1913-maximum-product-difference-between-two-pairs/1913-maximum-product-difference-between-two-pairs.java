

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int largeProduct = nums[n - 1] * nums[n - 2];
        int smallProduct = nums[0] * nums[1];

        return largeProduct - smallProduct;
    }
}