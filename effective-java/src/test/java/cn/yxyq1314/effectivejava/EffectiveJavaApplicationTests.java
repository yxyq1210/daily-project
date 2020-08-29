package cn.yxyq1314.effectivejava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EffectiveJavaApplicationTests {

    @Test
    void contextLoads() {
    }

    public static int[] twoSum(int[] nums, int target) {
    	int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; int target = 9;
        int [] result = twoSum(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
