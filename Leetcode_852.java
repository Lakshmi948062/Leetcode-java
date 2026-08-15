class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1])
            { 
                //we are in descending part
                end = mid;
            }
            else
            {
                //we are in ascending part
                start = mid+1;
            }
        }
        return start; //return end; it is also same because the start and end pointing to the same element or element that remains in last has been pointed by start and end
    }
}
