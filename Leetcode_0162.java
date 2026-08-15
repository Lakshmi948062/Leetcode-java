//Same problem as LEETCODE : 852
class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid]>nums[mid+1])
            {
                //we are at des part
                end = mid;
            }
            else
            {
                //we are at ascending part
                start = mid+1;
            }
        }
        return start;//return end;
    }
}
