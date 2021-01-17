class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2]; 
        for(int i =0;i<nums.length;i++){ 
            for(int j =0;j<nums.length;j++){
		//System.out.printf("i=%d;j=%d\n",i,j);
                if(nums[i]+nums[j]==target&&i!=j){
                    ans[0]=i;ans[1]=j;
                    break;
                }
            }
          
        }
        return ans;
    }
}
public class TwoSum{
	public static void main(String args[]) {
		Solution s = new Solution();
		int a[] = s.twoSum(new int[]{2,3,5,5,6},10);
		System.out.println("The final answer is "+a[0]+", "+a[1]);
	}
}
