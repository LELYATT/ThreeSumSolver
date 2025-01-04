package com.example.threesum;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumSolverTest {

    @Test
    void testThreeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );
        assertEquals(expected, ThreeSumSolver.threeSum(nums));
    }

    @Test
    void testThreeSumEmpty() {
        int[] nums = {};
        List<List<Integer>> expected = List.of();
        assertEquals(expected, ThreeSumSolver.threeSum(nums));
    }

    @Test
    void testThreeSumNoTriplets() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = List.of();
        assertEquals(expected, ThreeSumSolver.threeSum(nums));
    }
}
