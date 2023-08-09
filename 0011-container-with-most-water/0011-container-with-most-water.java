class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while(l < r){
            int lh = height[l];
            int rh = height[r];
            int min = Math.min(lh,rh);
            int width = r - l;
            int currArea = min * width;
            max = Math.max(max, currArea);
            if(lh < rh){
                l++;
            }else r--;
        }
        return max;
    }
}