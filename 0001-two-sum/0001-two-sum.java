class Solution {
    
        class Pair {
        int idx, val;
 
        public Pair(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }
 
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) pairs[i] = new Pair(i, nums[i]);
        Arrays.sort(pairs, Comparator.comparingInt(o -> o.val));
        int l = 0, r = n - 1;
        while (l < r) {
            int sum = pairs[l].val + pairs[r].val;
            if (sum == target) {
                return new int[]{ pairs[l].idx, pairs[r].idx };
            } else if (sum < target) l++;
            else r--;
        }
        return new int[] {};
    }
    }