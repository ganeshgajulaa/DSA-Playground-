class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        for(int i=0;i<nums.length;i++){
            boolean insrt = false;
            for(int j=0;j<ans.size();j++){
                boolean check = false;
                for(int k=0;k<ans.get(j).size();k++){
                    if(ans.get(j).get(k)==nums[i]){
                        check = true;
                    }
                }
                if(!check){
                    ans.get(j).add(nums[i]);
                    insrt = true;
                    break;
                    
                }
            }    
            if(!insrt){
                List<Integer> list = new ArrayList<Integer>();
                list.add(nums[i]);
                ans.add(list);
            }
        }
        return ans;
    }
}