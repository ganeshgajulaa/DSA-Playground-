class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        for(int i=0;i<n;i++){
            nums[i] = nums[i]*nums[i];
        }
        
        int i=0;int j=n-1;int k=n-1;
        while(i<=j){
            if(nums[i]<nums[j]){
                res[k]=nums[j];
                k--;
                j--;
            }else{
                res[k]=nums[i];
                k--;i++;
            }
        }
        
        return res;
    }
}