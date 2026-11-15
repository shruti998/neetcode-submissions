class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        return Math.max(rob(nums, 0, n-2),rob(nums,1,n-1) );   
    }
    public int rob(int[] nums, int start, int end)
    {
        int prev=0;
        int cur=0;
        int res=0;
        for(int i=start;i<=end;i++)
        {
            res=Math.max(cur, prev+nums[i]);
            prev=cur;
            cur=res;
        
        }
        return cur;
    }
}
