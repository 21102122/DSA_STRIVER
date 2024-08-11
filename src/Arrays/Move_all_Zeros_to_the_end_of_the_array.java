package Arrays;

public class Move_all_Zeros_to_the_end_of_the_array {
    public static void moveZeroes(int[] nums) {

        int i = 0;
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j]!=0){
                int temp= nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }

        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output should be: 1 3 12 0 0
    }
}
