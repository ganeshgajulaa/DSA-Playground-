class Solution {
    public int numOfPairs(String[] nums, String k) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i].concat(nums[j]).equals(k) && i!=j){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}