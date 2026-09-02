class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int k=nums[i];
            if(map.contains(k))
            return true;
            map.add(k);
        }
        return false;
    }
}