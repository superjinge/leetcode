package com.example.leetcode.editor.cn;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		Solution solution = new TwoSum().new Solution();
		int[] nums = new int[]{1, 2, 4, 8};
		int target = 9;
		int[] out = solution.twoSum(nums, target);
		System.out.println(Arrays.toString(out));
	}

	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public int[] twoSum(int[] nums, int target) {
			// 存放补全的值和下标
			Map<Integer, Integer> mappingMap = new HashMap<>(nums.length);
			// 使用两遍循环
			// for (int i = 0; i < nums.length; i++) {
			// 	mappingMap.put(nums[i], i);
			// }
			// 使用一遍哈希表
			for (int i = 0; i < nums.length; i++) {
				int complement = target - nums[i];
				if (mappingMap.containsKey(complement)) {
					// 返回 map里面和当前匹配数值的下标
					return new int[]{mappingMap.get(complement), i};
				}
				mappingMap.put(nums[i], i);
			}
			throw new IllegalArgumentException("No Two solution");
		}

	}
//leetcode submit region end(Prohibit modification and deletion)

}
