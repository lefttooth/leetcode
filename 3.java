class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; // 指向当前非零元素该放的位置

        // 第一步：将所有非零元素移动到数组前面，保持顺序
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        // 第二步：将剩余的位置填充为 0
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
