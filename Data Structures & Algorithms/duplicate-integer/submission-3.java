class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniq = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++)
        {

            if(uniq.contains(nums[i]))
            {
                return true;
            }
            uniq.add(nums[i]);
        }

        return false;

    }
}