class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        
        if(nums.length==0)  return 0;
        
        int i= 1;
        int count = 1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                i++;                
            }
            else{
                if(nums[i]==(nums[i-1]+1)){
                    count++;
                    i++;
                }
                else{
                    count=1;
                    i++;
                }
            }
            max= Math.max(count,max);
        }
        return max;
            }
}