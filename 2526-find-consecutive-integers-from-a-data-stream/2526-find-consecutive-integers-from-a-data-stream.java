class DataStream {
    int i,j,k,value;
    int cnt;
    List<Integer> ls;

    public DataStream(int value, int k) {
        this.value = value;this.k = k;
        this.i = 0;this.j=0;
        this.cnt = 0;
        this.ls = new ArrayList<>();
        }
    
    public boolean consec(int num) {
        boolean ans = false;
        ls.add(num);
        if(ls.get(j)==value)    cnt++;
        
        if(j-i+1<k) {
            j++;return false;}
        
        else if(j-i+1==k) {
            if(cnt==k)  ans= true;
            else ans=false;            
        }
        if(ls.get(i)==value)    cnt--;
        i++;
        j++;
        return ans;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */