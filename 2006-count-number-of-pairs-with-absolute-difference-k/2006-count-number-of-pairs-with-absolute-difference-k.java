class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt =0;
        Map<Integer,Integer> freq = new HashMap<>();
        
        for(int num : nums){
            cnt += freq.getOrDefault(num+k,0) + freq.getOrDefault(num-k,0);
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        return cnt;
    }
}