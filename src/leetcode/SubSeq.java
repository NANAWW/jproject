package leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author wnn
 * @date 2021/3/24-23:17
 * @descriptuion
 */
public class SubSeq {
    public boolean find132pattern(int[] nums) {
        //数组长度
        int len = nums.length;
        //初始化一个数组，存储左侧最小值
        int[] leftMin = new int[len];
        Arrays.fill(leftMin,Integer.MAX_VALUE);
        for (int i = 1; i < len; i++) {
            leftMin[i] = Math.min(leftMin[i-1],nums[i-1]);
        }
        //初始化单调栈
        Stack<Integer> stack = new Stack<Integer>();
        for (int j = len-1; j > -1; j--) {
            int numk = Integer.MIN_VALUE;
            while(!stack.empty()&& nums[j]>stack.peek()){
                //初步找到nums[k]
                numk = stack.pop();
            }
            //最后判断条件
            if (numk>leftMin[j]){
                return true;
            }
            //继续运行说明没有找到合适的numk，由于左侧没有比numk还小的数，直接压栈，更新numk的值
            stack.push(nums[j]);
        }

        return false;
    }
}
