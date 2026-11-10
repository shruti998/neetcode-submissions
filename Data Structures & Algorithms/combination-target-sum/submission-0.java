class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums,0,target,new ArrayList<>());
        return res;

    }
    public void backtrack(int nums[], int index, int target, List<Integer> current)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(current));
            return;
        }
        if(nums.length==index) return;
        if(nums[index]<=target)
        {
            current.add(nums[index]);
            backtrack(nums,index,target-nums[index],current);
            current.remove(current.size()-1);

        }
       
            backtrack(nums,index+1,target,current);
        
    }
}
