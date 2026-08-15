class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int trg = numbers[start] + numbers[end];
            if (trg == target) {
                return new int[]{start+1,end+1};
            } else if (trg > target) {
                end--;
            } else {
                start++;
            }
        }return new int[]{-1,-1};
    }
}