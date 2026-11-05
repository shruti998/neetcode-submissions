class Solution {
    public int findMin(int[] nums) {
        //rotated sorted arry
        // the min will be in unsorted part
        if(nums[0]<nums[nums.length-1]) return nums[0];
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[right]>nums[left]) return nums[left];
            // mid should be less then left and right
            if((mid==0||nums[mid]<nums[mid-1])&&(mid==nums.length-1||nums[mid]<nums[mid+1]) )
            {
                return nums[mid];
            }
            else if(nums[left]<=nums[mid])
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
