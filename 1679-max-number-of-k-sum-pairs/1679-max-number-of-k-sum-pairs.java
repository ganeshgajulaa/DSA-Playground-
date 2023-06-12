class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int cnt = 0;
        
        for(int num:nums){
            if(mp.containsKey(k-num) && mp.get(k-num)>0){
                mp.put(k-num,mp.getOrDefault(k-num,0)-1);
                cnt++;
            }
            else{
                mp.put(num,mp.getOrDefault(num,0)+1);
            }
        }
        return cnt;
    }
}