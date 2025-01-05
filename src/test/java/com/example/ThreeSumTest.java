package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ThreeSumTest {

    @Test
    public void testThreeSumExample1() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(2, result.size());
        assertTrue(result.contains(List.of(-1, -1, 2)));
        assertTrue(result.contains(List.of(-1, 0, 1)));
    }

    @Test
    public void testThreeSumExample2() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {0, 1, 1};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(0, result.size());
    }

    @Test
    public void testThreeSumExample3() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {1, 2, -2, -1};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(0, result.size());
    }

    @Test
    public void testThreeSumExample4() {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {0, 0, 0};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(0, 0, 0)));
    }
}
