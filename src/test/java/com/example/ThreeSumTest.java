package com.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {

    ThreeSum threeSum = new ThreeSum();

    @Test
    public void testThreeSumMultipleDuplicates() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum(nums);

        // Sort the result lists to ensure they can be compared easily
        result.forEach(Collections::sort);

        // Expected result
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );

        // Sort expected to ensure it matches the result
        expected.forEach(Collections::sort);

        // Assert the result contains the expected triplets
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumNoSolution() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(0, result.size());  // No triplets sum to 0
    }

    @Test
    public void testThreeSumOneSolution() {
        int[] nums = {-1, 0, 1};
        List<List<Integer>> result = threeSum.threeSum(nums);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, 1));
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumAllZeroes() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> result = threeSum.threeSum(nums);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSumEmptyArray() {
        int[] nums = {};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(0, result.size());  // No triplets can be formed from an empty array
    }

    @Test
    public void testThreeSumOneElement() {
        int[] nums = {1};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(0, result.size());  // No triplets can be formed from a single element
    }
}
