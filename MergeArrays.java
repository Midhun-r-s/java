import java.util.Scanner;

class Solution {
    public void merge() {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of elements in the first array:");
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter the elements in the first array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
         System.out.println("Enter the number of elements in the second array:");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] mergedArray = new int[m + n];
        for (int i = 0; i < m; i++) {
            mergedArray[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            mergedArray[m + i] = nums2[i];
        }
        System.out.println("Merged array is:");
        System.out.println("Merged array is: " + 	Arrays.toString(mergedArray));
    }
}
public class MergeArrays {
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.merge();
    }
}