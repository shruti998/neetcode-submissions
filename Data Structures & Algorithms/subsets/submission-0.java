class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
       backtrack(nums,0,new ArrayList<>()); 
       return res;
    }
    public void backtrack(int[] nums,int index, List<Integer> current)
    {
        //base condition
        if(index==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        //decision
        current.add(nums[index]);
        
        //explore
        backtrack(nums,index+1,current);
        //undo
        current.remove(current.size()-1);
        backtrack(nums,index+1,current);

    }
}
