class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] pref = new int[words.length];
        // String[] charArr = words.toCharArray();
        int m = words[0].length();
        if(words[0].charAt(0)=='a' || words[0].charAt(0)=='e' || words[0].charAt(0)=='i' || words[0].charAt(0)=='o' || words[0].charAt(0)=='u'){
                if(words[0].charAt(m-1)=='a' || words[0].charAt(m-1)=='e' || words[0].charAt(m-1)=='i' || words[0].charAt(m-1)=='o' || words[0].charAt(m-1)=='u'){
                    pref[0]=1;
                }                  
            }
        
        for(int i=1;i<words.length;i++){
            m = words[i].length();
            if(words[i].charAt(0)=='a' || words[i].charAt(0)=='e' || words[i].charAt(0)=='i' || words[i].charAt(0)=='o' || words[i].charAt(0)=='u'){
                if(words[i].charAt(m-1)=='a' || words[i].charAt(m-1)=='e' || words[i].charAt(m-1)=='i' || words[i].charAt(m-1)=='o' || words[i].charAt(m-1)=='u'){
                    pref[i]=1+pref[i-1];
                }else{
                    pref[i]=pref[i-1];
                }                    
            }else{
                    pref[i]=pref[i-1];
            }
        }
        
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0] ;
            int end = queries[i][1];
            if(start == 0){
                ans[i] = pref[end];
            }else{
            ans[i] = pref[end] - pref[start-1];
                
            }
        }
        return ans;
    }
}