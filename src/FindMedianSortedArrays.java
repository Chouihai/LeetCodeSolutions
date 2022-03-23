import java.util.Arrays;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int [] nums1 = {0,5,6,8};
        int [] nums2 = {7,3,31,5};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combined = new int[nums1.length+nums2.length];
        int i = 0;
        for (i=0; i< combined.length; i++){
            combined[i] = (i< nums1.length) ? nums1[i] : nums2[i-];
        }
        for (int n = 1; n<combined.length; n++){
            int current = combined[n];
            int m = n-1;
            while( m>= 0 && combined[m] > current){
                combined[m+1] = combined[m];
                m--;
            }
            combined[m+1] = current;
        }
        System.out.println(Arrays.toString(combined));
        if(combined.length%2 != 0){
            return combined[combined.length/2];
        }else{
            return (combined[combined.length/2] + combined[combined.length/2-1])/2.0;
        }
    }
}
