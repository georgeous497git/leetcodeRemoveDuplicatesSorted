package com.lambda.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.lambda.remove.duplicates.RemoveDuplicatesSorted;

/*
 * Type: Test
 * Name: Jorge Alberto Correa Reyes (Lambda)
 * Date: December 14 2020
 * Level: Easy
 * Platform: Leetcode
 * */

public class RemoveDuplicatesSortedTest {

	@Test
	public void test1() {
		
		int[] nums = {1,1,1,2,3,4,4,4};
		int positionsExpected = 4;
		int[] arrayExpected = {1,2,3,4};
		
		assertEquals(positionsExpected, RemoveDuplicatesSorted.removeDuplicates(nums));
		assertArrayEquals(arrayExpected, RemoveDuplicatesSorted.getNewArray(nums, positionsExpected));
	}
	
	@Test
	public void test2() {
		
		int[] nums = {1,1,2};
		int positionsExpected = 2;
		int[] arrayExpected = {1,2};
		
		assertEquals(positionsExpected, RemoveDuplicatesSorted.removeDuplicates(nums));
		assertArrayEquals(arrayExpected, RemoveDuplicatesSorted.getNewArray(nums, positionsExpected));
	}
	
	@Test
	public void test3() {
		
		int[] nums = {1,1,1};
		int positionsExpected = 1;
		int[] arrayExpected = {1};
		
		assertEquals(positionsExpected, RemoveDuplicatesSorted.removeDuplicates(nums));
		assertArrayEquals(arrayExpected, RemoveDuplicatesSorted.getNewArray(nums, positionsExpected));
	}
	
	@Test
	public void test4() {
		
		int[] nums = {1,2,3};
		int positionsExpected = 3;
		int[] arrayExpected = {1,2,3};
		
		assertEquals(positionsExpected, RemoveDuplicatesSorted.removeDuplicates(nums));
		assertArrayEquals(arrayExpected, RemoveDuplicatesSorted.getNewArray(nums, positionsExpected));
	}
	
	@Test
	public void test5() {
		
		int[] nums = {};
		int positionsExpected = 0;
		int[] arrayExpected = {};
		
		assertEquals(positionsExpected, RemoveDuplicatesSorted.removeDuplicates(nums));
		assertArrayEquals(arrayExpected, RemoveDuplicatesSorted.getNewArray(nums, positionsExpected));
	}
	
	@Test
	public void test6() {
		
		int[] nums = {2};
		int positionsExpected = 1;
		int[] arrayExpected = {2};
		
		assertEquals(positionsExpected, RemoveDuplicatesSorted.removeDuplicates(nums));
		assertArrayEquals(arrayExpected, RemoveDuplicatesSorted.getNewArray(nums, positionsExpected));
	}
	
	@Test
	public void test7() {
		
		int[] nums = {-1,-1,0,0,1,1,2,2};
		int positionsExpected = 4;
		int[] arrayExpected = {-1,0,1,2};
		
		assertEquals(positionsExpected, RemoveDuplicatesSorted.removeDuplicates(nums));
		assertArrayEquals(arrayExpected, RemoveDuplicatesSorted.getNewArray(nums, positionsExpected));
	}
}
