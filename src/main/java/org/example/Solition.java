package org.example;

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int ptr = 0;
        int ptr2 = n-1;
        int i = 0;

        while (i <= ptr2) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ptr++;
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[ptr2];
                nums[ptr2] = temp;
                ptr2--;
            } else {
                i++;
            }
        }
    }
}