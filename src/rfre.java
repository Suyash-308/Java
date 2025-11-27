import java.util.Arrays;

public class rfre {

     public static void main(String[] args) {
            int[] nums = {2, 3, 1, 4, 5, 6};
            int k = 4;

            Arrays.sort(nums);  // sort ascending

            int kthLargest = nums[nums.length - k];  // pick kth from end
            System.out.println("Kth largest = " + kthLargest);
        }
    }


