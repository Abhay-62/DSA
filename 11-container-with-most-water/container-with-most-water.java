class Solution {
    public int maxArea(int[] height) {
      int low=0;
      int high=height.length-1;
      int maxarea=Integer.MIN_VALUE;
      while(low<high){
        int width=high-low;
        int area=width* Math.min(height[low],height[high]);
        maxarea=Math.max(area,maxarea);
        if(height[low]<=height[high]){
            low++;
        }else{
            high--;
        }
      }
      return maxarea;
    }
}