
/*Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

 

Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
 

Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 9 */

public class LeetCode1089_DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            if (i == n-1) break;
            
            if (arr[i] == 0) {
                for (int j=n-1; j>i; j--) {
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        } 
        
    }
}
