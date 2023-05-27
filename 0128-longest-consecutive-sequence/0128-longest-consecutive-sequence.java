class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num: nums){
            st.add(num);
        }
        if(nums.length==0){
            return 0;
        }
        int longest = 0;
        int currLen = 0;
        for(int num:nums){
            if(!st.contains(num-1)){
                int start = num;
                currLen = 1;
                while(st.contains(start+1)){
                    currLen++;
                    start=start+1;
                }
            }
            longest = Math.max(currLen,longest);
            
        }
        return longest;
    }
}