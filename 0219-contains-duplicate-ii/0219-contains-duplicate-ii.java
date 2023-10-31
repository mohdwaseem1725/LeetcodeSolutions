class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int n = nums.length;
        Set<Integer> hs = new HashSet<>();
        
        for(int i = 0, j = 0; j < n; j++){
            if(Math.abs(i - j) > k){
                hs.remove(nums[i]);
                i++;
            }
            
            if(hs.contains(nums[j]))
                return true;
            
            hs.add(nums[j]);
        }
        return false;
        
    }
}