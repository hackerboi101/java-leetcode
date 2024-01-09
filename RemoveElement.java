import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;

        int j = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;

            }
        }
        int newLength = j;

        System.out.println(Arrays.toString(nums));
        return newLength;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        RemoveElement main = new RemoveElement();
        int newLength = main.removeElement(nums, val);
        System.out.println(newLength);
    }
}