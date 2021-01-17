class shuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int itr = 0;
        for(int i=0,j=n;i<n&&j<nums.length;i++,j++){
            ans[itr++] = nums[i];
            ans[itr++] = nums[j];
        }
        return ans;
    }
}
