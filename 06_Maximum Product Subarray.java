class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        int res = max;

        for(int i=1;i<n;i++){
            int curr = nums[i];
            int temp = Math.max(curr, Math.max(curr*min, curr*max));
            min = Math.min(curr, Math.min(curr*min, curr*max));
            max = temp;

            res = Math.max(res,max);
        }
        return res;
    }
}