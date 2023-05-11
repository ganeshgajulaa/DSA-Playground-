class Solution {
    public int firstUniqChar(String s) {
        
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
                        String c = ""+s.charAt(i);            
                map.put(c,map.getOrDefault(c,0)+1);
            
        }
        for(int i=0;i<s.length();i++){
            String c = ""+s.charAt(i);
            if(map.get(c)==1){
                return i;
            }
        }
                    return -1;

    }
}