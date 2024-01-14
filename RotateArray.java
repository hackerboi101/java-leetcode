import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        RotateArray obj = new RotateArray();
        obj.rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
