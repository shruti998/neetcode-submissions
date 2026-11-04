class Solution {
    public int search(int[] nums, int target) {
        // binary search 
        //dictionary jaisa divide karnege and mid se compare karenge
        if(nums==null|| nums.length==0) return -1;
        if(nums.length==1&&nums[0]==target) return 0;
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
        
    }
}
