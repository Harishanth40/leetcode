class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int a = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[a - 1]) {
                nums[a] = nums[j];
                a++;
            }
        }
        return a;        
    }
}