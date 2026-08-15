class Solution {
    public int findNumbers(int[] nums) {
        int count = 0 ;
        for(int num : nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    boolean even(int num)
    {
        int NumofDigits = Digits(num);
        if(NumofDigits % 2 == 0)
        {
            return true;
        }
        return false;
    }
    int Digits(int num)
    {
        if(num<0)
        {
            num = num * -1;
        }
        if(num==0)
        {
            return -1;
        }
        return (int)(Math.log10(num) + 1);
        /*
        int count = 0;
        while(num<0)
        {
            count++;
            num/=10;
        }
        */
    }
}
