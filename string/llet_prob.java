class Solution {
    public int secondHighest(String s) {
         
        String digits = s.replaceAll("[^0-9]", "");

        
        if (digits.length() < 2) return -1;

        int n = digits.length();
        int arr[] = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = digits.charAt(i) - '0';  
        }

        Arrays.sort(arr);

        int largest = arr[n - 1];

        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }

        return -1;        
    }
}