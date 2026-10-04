class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniq = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            uniq.add(nums[i]);
        }


        if(uniq.size() != nums.length)
        {
            return true;
        }

        else {
            return false;
        }

    }
}