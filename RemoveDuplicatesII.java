import java.util.Arrays;

public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        boolean twice = false;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[i] && twice == false) {
                twice = true;
                i++;
                nums[i] = nums[j];
            } else if (nums[j] != nums[i]) {
                twice = false;
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.println(new RemoveDuplicatesII().removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
