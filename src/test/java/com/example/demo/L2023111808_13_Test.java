package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays; // 导入 Arrays 用于 assertArrayEquals

/**
 * 测试用例设计总体原则：test11111
 * * 1. 等价类划分：[cite: 33]
 * - 有效等价类 (E1)：数组包含 0, 1, 2 三种元素 (e.g., 示例1: [2,0,2,1,1,0])
 * - 有效等价类 (E2)：数组已排序 (e.g., [0,0,1,2,2])
 * - 有效等价类 (E3)：数组逆序 (e.g., [2,2,1,1,0])
 * - 有效等价类 (E4)：数组只包含部分颜色 (e.g., 只有1和2: [1,2,1])
 * - 有效等价类 (E5)：数组只包含一种颜色 (e.g., [1,1,1])
 * * 2. 边界值分析：
 * - 边界 (B1)：空数组 []
 * - 边界 (B2)：单元素数组 [1]
 */
public class L2023111808_13_Test { //

    // 实例化被测试的类
    private Solution solution = new Solution();

    /**
     * 测试目的：测试示例1，包含0, 1, 2的混合数组 (覆盖 E1) [cite: 34]
     * 测试用例：
     * - 输入: nums = [2,0,2,1,1,0]
     * - 预期输出: [0,0,1,1,2,2]
     */
    @Test // [cite: 32]
    public void testExample1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    /**
     * 测试目的：测试示例2，短的混合数组 (覆盖 E1) [cite: 34]
     * 测试用例：
     * - 输入: nums = [2,0,1]
     * - 预期输出: [0,1,2]
     */
    @Test // [cite: 32]
    public void testExample2() {
        int[] nums = {2, 0, 1};
        int[] expected = {0, 1, 2};
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    /**
     * 测试目的：测试已排序的数组 (覆盖 E2) [cite: 34]
     * 测试用例：
     * - 输入: nums = [0,0,1,1,2,2]
     * - 预期输出: [0,0,1,1,2,2]
     */
    @Test // [cite: 32]
    public void testAlreadySorted() {
        int[] nums = {0, 0, 1, 1, 2, 2};
        int[] expected = {0, 0, 1, 1, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    /**
     * 测试目的：测试逆序排列的数组 (覆盖 E3) [cite: 34]
     * 测试用例：
     * - 输入: nums = [2,2,1,1,0,0]
     * - 预期输出: [0,0,1,1,2,2]
     */
    @Test // [cite: 32]
    public void testReverseSorted() {
        int[] nums = {2, 2, 1, 1, 0, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    /**
     * 测试目的：测试空数组 (覆盖 B1) [cite: 34]
     * 测试用例：
     * - 输入: nums = []
     * - 预期输出: []
     */
    @Test // [cite: 32]
    public void testEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    /**
     * 测试目的：测试单元素数组 (覆盖 B2) [cite: 34]
     * 测试用例：
     * - 输入: nums = [1]
     * - 预期输出: [1]
     */
    @Test // [cite: 32]
    public void testSingleElement() {
        int[] nums = {1};
        int[] expected = {1};
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    /**
     * 测试目的：测试只包含一种颜色的数组 (覆盖 E5) [cite: 34]
     * 测试用例：
     * - 输入: nums = [2,2,2]
     * - 预期输出: [2,2,2]
     */
    @Test // [cite: 32]
    public void testOnlyTwos() {
        int[] nums = {2, 2, 2};
        int[] expected = {2, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }

    /**
     * 测试目的：测试只包含两种颜色的数组 (覆盖 E4) [cite: 34]
     * 测试用例：
     * - 输入: nums = [1,0,1,0]
     * - 预期输出: [0,0,1,1]
     */
    @Test // [cite: 32]
    public void testOnlyZerosAndOnes() {
        int[] nums = {1, 0, 1, 0};
        int[] expected = {0, 0, 1, 1};
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }
}
