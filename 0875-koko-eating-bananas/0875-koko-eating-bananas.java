class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        int start = 1;
        int end = max;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int totalHours = 0;

            for (int pile : piles) {
                totalHours += (pile + mid - 1) / mid;
            }
            if (totalHours > h) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}