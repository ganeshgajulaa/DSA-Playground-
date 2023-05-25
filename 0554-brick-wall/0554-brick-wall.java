class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int cuts = wall.size();
        for(int i=0;i<wall.size();i++){
            int dist = 0;
            List<Integer> row=wall.get(i);
            for(int j=0;j<row.size()-1;j++){
                dist+=row.get(j);
                if(mp.containsKey(dist)){
                    int index = mp.get(dist);
                    // cuts = Math.min(cuts,wall.size() - index);
                    mp.put(dist,mp.getOrDefault(dist,0)+1);

                }else{
                    mp.put(dist,1);
                }

            }
        }
        for(int key:mp.keySet()){
            cuts = Math.min(cuts,wall.size() - mp.get(key));
        }
        return cuts;
    }
}