package org.example;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2, 2, 1, 1, 0};
        solution.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {2, 0, 1};
        solution.sortColors(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
