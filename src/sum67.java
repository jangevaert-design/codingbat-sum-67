public class sum67 {
  public int sum67(int[] nums) {
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 6) {
        sum += nums[i];
      }
      if (nums[i] == 6) {
        while (nums[i] != 7) {
          i++;
        }
      }
    }
    return sum;
  }
}
