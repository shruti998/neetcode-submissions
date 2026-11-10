class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
       backtrack(nums,0,target,new ArrayList<>());
       return res; 
    }
    public void backtrack(int[] nums,int index,int target, List<Integer> current)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            if(i>index&&nums[i]==nums[i-1]) continue; //dublicates
            if(nums[i]>target) break;
            //add
            current.add(nums[i]);
            backtrack(nums, i+1,target-nums[i],current);
            current.remove(current.size()-1);
            

        }
    }
}
