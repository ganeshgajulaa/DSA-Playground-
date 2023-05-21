class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> mp = new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            if(mp.containsKey(words[i])){
                mp.put(words[i],mp.getOrDefault(words[i],0)+1);
            }else{
                mp.put(words[i],1);
            }
        }
//                     lc-1 cl-1 gg-1
        int ans = 0;boolean cntr = false;
        for(Map.Entry<String,Integer> entry : mp.entrySet()){
            int freq = entry.getValue();
            String wrd = entry.getKey();
            if(wrd.charAt(1)==wrd.charAt(0)){
                if(freq%2==0){
                    ans+=freq;
                }
                else{
                    ans+=freq-1;
                    cntr = true;
                }
            }
            else if(wrd.charAt(0)<wrd.charAt(1)){
                String rev = ""+wrd.charAt(1)+wrd.charAt(0);
                if(mp.containsKey(rev)){
                    ans+=2 * Math.min(freq,mp.get(rev));
                                    }
            }
        }
        
            if(cntr){
                ans+=1;
            }
        return ans*2;
    }
}