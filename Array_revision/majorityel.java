class Solution {
    //optimize solution o(n log n)   Total = O(n log n) + O(n) But in time complexity, we take the dominating term.
    //O(n log n) dominates O(n)



    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
          int freq=1;
         int ans=nums[0];
        for(int i=1;i<n;i++){
          
            if(nums[i]==nums[i-1]){
                freq++;
               
                }else{
                    freq=1;
                    ans=nums[i];
                }
                if(freq>n/2){
                    return ans;
                }
            
        }
        
       return ans;
    }
}