class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = mat.length;int m=mat[0].length;int ans = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
            mp.put(arr[i],i);
        
        for(int i=0;i<n;i++){
            int c = 0;
            for(int j=0;j<m;j++){
                c = Math.max(c,mp.get(mat[i][j]));
            }
            ans = Math.min(c,ans);
        }
        for(int i=0;i<m;i++){
            int c = 0;
            for(int j=0;j<n;j++){
                c = Math.max(c,mp.get(mat[j][i]));
            }
            ans = Math.min(c,ans);
        }
        return ans;
    }
}