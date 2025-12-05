class Solution {
    public int singleNumber(int[] nums) {
        
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}


//a ^ a = 0  
// a ^ 0 = a xor
// | Step | Operation  | ans |
// | ---- | ---------- | --- |
// | 1    | 0 ^ 4  → 4 | 4   |
// | 2    | 4 ^ 1  → 5 | 5   |
// | 3    | 5 ^ 2  → 7 | 7   |
// | 4    | 7 ^ 1  → 6 | 6   |
// | 5    | 6 ^ 2  → 4 | 4   |
