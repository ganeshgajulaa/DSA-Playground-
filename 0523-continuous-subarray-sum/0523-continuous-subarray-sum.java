class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        mp.put(0,0);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];//2 6 9
            int mod = sum%k;//2 0 3
            if(mod==0 && i-0>0){
                return true;
            }
            if(mp.containsKey(mod)){//
                int index = mp.get(mod); 
                if(i-index>1){
                return true;
                }
            }
            else{
                mp.put(mod,i);//5,0 1,1
            }
                        
            
        }
        return false;
    }
}