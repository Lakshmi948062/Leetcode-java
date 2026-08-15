class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1};
        int start = search(nums,target,true); //if we found mid it is treated as possible solution but wt if the array is having the same value at the further smaaler index
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    int search(int[] nums,int target,boolean StartIndex)
    {
        int ans = -1; //default return givem i problem statement
        //binary search technique
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target < nums[mid])
            {
                end = mid - 1;
            }
            else if(target > nums[mid])
            {
                start = mid + 1;
            }
            else
            {
                ans = mid;
                if(StartIndex) // true go left side of array
                {
                    end = mid - 1;
                }
                else  //false go to right side of array
                {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
