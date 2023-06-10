class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum%k==0 & i+1>1){
                return true;
            }
            if(mp.containsKey(sum%k) ){
                if(i-mp.get(sum%k)>1){
                    return true;
                }
            }
            if(!mp.containsKey(sum%k)){
                mp.put(sum%k,i);
            }
        }
        return false;
    }
}