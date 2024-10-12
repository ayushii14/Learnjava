public class Leetcode {

        public static int[] merge(int[] nums1, int m, int[] nums2, int n, int[]nums3) {
            int i = 0, j = 0;
    
            while (i < m && j < n) {
                if (nums1[i] <= nums2[j]) {
                    nums3[i + j] = nums1[i];
                    i++;
                } else {
                    nums3[i + j] = nums2[j];
                    j++;
                }
            }
            while (i < m) {
                nums3[i + j] = nums1[i];
                i++;
            }
            while (j < n) {
                nums3[i + j] = nums2[j];
                j++;
            }
           return nums3;
        }
    
        public static void main(String[] args) {
            int[] nums1 = {2,3,5};
            int m = 3;
    
            int[] nums2 = {6,8,9};
            int n = 3;
    
            int[] nums3 = new int[m + n];
            
            System.out.println("Array after merging is:");
            merge(nums1, m, nums2, n, nums3);
            System.out.print("{");
            for (int i = 0; i < m + n; i++) {
              
                System.out.print(+nums3[i]+",");
            }System.out.print("}");
    
        }
    }

