class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
      
          int freq=0;
         int ans=0;
        for(int i=0;i<n;i++){
          
            if(freq==0){
                ans=nums[i];
               
                }if(ans==nums[i]){
                    freq++;
                   
                }else{
                    freq--;
                }
                
            
        }
        
       return ans;
    }
}

// Here is the **BEST and simplest explanation** of **Moore’s Voting Algorithm** exactly for **your code**, step-by-step and in **easy exam-friendly words** 👇

// ---

// # ✅ **Moore’s Voting Algorithm – Simple Explanation (for your code)**

// The goal is to find the element that appears **more than n/2 times**.

// Instead of counting each element fully, we use a **smart cancellation trick**.

// ---

// # 🎯 **Main Idea**

// * Maintain a **candidate** (`ans`)
// * Maintain a **count** (`freq`)
// * If we meet the **same number**, we increase freq
// * If we meet a **different number**, we decrease freq
// * When freq becomes **0**, we pick a new candidate

// ### ⭐ Why does this work?

// Because the majority element appears **more than all others combined**, it will survive even after all “cancellations”.

// ---

// # 🔍 **Step-by-Step Logic (as used in your code)**

// ### Variables:

// ```
// freq = 0
// ans = anything (default 0)
// ```

// ### Loop through each element:

// ```
// for i = 0 to n-1:
// ```

// ## ✔️ **1. If freq becomes 0 → choose a new candidate**

// ```
// if(freq == 0)
//     ans = nums[i];
// ```

// This means:
// “All votes till now got canceled, so let me try nums[i] as the new majority candidate.”

// ---

// ## ✔️ **2. If the current number matches the candidate → increase freq**

// ```
// if(ans == nums[i])
//     freq++;
// ```

// ---

// ## ✔️ **3. If the current number is different → decrease freq**

// ```
// else
//     freq--;
// ```

// This simulates a cancel-out between majority and non-majority numbers.

// ---

// # ⭐ RESULT

// The element stored in `ans` at the end is the **majority element**, because:

// * Majority element appears more than n/2 times
// * Even after cancellation, it will still remain as the final candidate

// ---

// # 🧠 **Intuitive Explanation (Very Easy)**

// Imagine the array as a row of people voting.

// * If the next person votes for the same candidate → support increases
// * If another person votes against → a supporter leaves
// * If supporters become zero → choose a new candidate
// * At the end, the only person who gets the most support is the majority element

// ---

// # 💯 **Why Your Code Works**

// Your code exactly implements this logic:

// ```java
// if(freq == 0) {
//     ans = nums[i];   // choose new candidate
// }

// if(ans == nums[i]) {
//     freq++;          // same → support++
// } else {
//     freq--;          // different → support--
// }
// ```

// Finally:

// ```
// return ans;
// ```

// ---

// # 🎉 **Conclusion**

// Moore’s Voting Algorithm gives:

// * **Time complexity:** O(n)
// * **Space complexity:** O(1)
// * Super fast and most optimal

// ---

// If you want, I can also give you:

// ✔️ Dry run example
// ✔️ Handwritten explanation style
// ✔️ Comparison with other methods (brute force, sorting)
