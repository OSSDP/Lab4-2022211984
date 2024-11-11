import org.example.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testSortColors() {
        Solution solution = new Solution();

        // Test case 1: General case with all three colors
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums1);

        // Test case 2: Already sorted array
        int[] nums2 = {0, 0, 1, 1, 2, 2};
        solution.sortColors(nums2);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums2);

        // Test case 3: Array with only one color
        int[] nums3 = {1, 1, 1, 1};
        solution.sortColors(nums3);
        assertArrayEquals(new int[]{1, 1, 1, 1}, nums3);

        // Test case 4: Array with two colors
        int[] nums4 = {2, 1, 2, 1};
//        int[] nums4 = {2};
        solution.sortColors(nums4);
        assertArrayEquals(new int[]{1, 1, 2, 2}, nums4);

        // Test case 5: Empty array
        int[] nums5 = {};
        solution.sortColors(nums5);
        assertArrayEquals(new int[]{}, nums5);

        // Test case 6: Single-element array
        int[] nums6 = {0};
        solution.sortColors(nums6);
        assertArrayEquals(new int[]{0}, nums6);
    }
}
