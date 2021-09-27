package leetcode.easy;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		MergeSortedArray solution = new MergeSortedArray();
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int m = 3;
		int[] nums2 = {2, 5, 6};
		int n = 3;

		solution.merge(nums1, m, nums2, n);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >= 0 && j >= 0)
			nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];

		while (j >= 0)
			nums1[k--] = nums2[j--];
	}
}
