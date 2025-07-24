class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment it
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry needed
            }

            // Otherwise, set this digit to 0 and continue the loop
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit at the start
        int[] result = new int[n + 1];
        result[0] = 1; // e.g., 999 + 1 = 1000

        return result;
    
        
    }
}