class sumArray {
    public int[] runningSum(int[] nums) {
        int[] nums1 = nums;
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums1[i] = sum;
        }  
        return nums1;
    }
}
