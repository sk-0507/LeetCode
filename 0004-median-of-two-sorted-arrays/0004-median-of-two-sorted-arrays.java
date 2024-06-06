class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr1Length = nums1.length;
        int arr2Length = nums2.length;
        int arr3[] = new int[arr2Length + arr1Length];
        int j = 0;
        for (int i = 0; i < arr1Length; i++) {
            arr3[j++] = nums1[i];
        }
        for (int i = 0; i < arr2Length; i++) {
            arr3[j++] = nums2[i];
        }
        Arrays.sort(arr3);
        int arr3Length = arr3.length;
        if (arr3Length % 2 == 0) {
            double median  = (arr3[arr3Length / 2] + arr3[(arr3Length / 2) - 1]) / 2.0;
            return median;

        } else {
            return arr3[arr3Length / 2];
        }

    }
}