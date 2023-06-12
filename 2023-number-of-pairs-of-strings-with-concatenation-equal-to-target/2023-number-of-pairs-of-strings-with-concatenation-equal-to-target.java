class Solution {
    public int numOfPairs(String[] nums, String k) {
        Map<String,Integer> mp = new HashMap<>();
        int cnt = 0;
        for(String num:nums){
            if(k.startsWith(num)){
                String suffix = k.substring(num.length());
                cnt+=mp.getOrDefault(suffix,0);
            }
            if(k.endsWith(num)){
                String prefix = k.substring(0,k.length() - num.length());
                cnt+=mp.getOrDefault(prefix,0);
            }
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        return cnt;
    }
}