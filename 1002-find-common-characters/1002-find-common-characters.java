class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        
        String firstStr = words[0]; 
            for(int i=0;i<firstStr.length();i++){
                char key = firstStr.charAt(i);
                map.put(key,map.getOrDefault(key,0)+1);
            }
        
        for(int j= 1;j<words.length;j++){
            String str = words[j];
            Map<Character,Integer> freqMap = new HashMap<>();
            for(int i=0;i<str.length();i++){
                char key = str.charAt(i);
                freqMap.put(key,freqMap.getOrDefault(key,0)+1);
            }
            
            for(Character key:map.keySet()){
                if(freqMap.containsKey(key)){
                    map.put(key,Math.min(map.get(key),freqMap.get(key)));
                }
                else{
                    map.put(key,0);
                }
            }
        }
        
        List<String> res = new ArrayList<>();

        for(Character key:map.keySet()){
            if(map.get(key)>0){
                for(int l=0;l<map.get(key);l++){
                    res.add(key+"");
                }
            }
        }
        return res;
    }
}