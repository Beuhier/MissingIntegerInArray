package com.interview.ThreeLineCardManagement.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.interview.ThreeLineCardManagement.MissingIntegerInArraySolution;

class MissingIntegerInArraySolutionTest {
	
	@Test
	void test1() {
		int [] testArray = {1,2,3};
		Assertions.assertEquals(MissingIntegerInArraySolution.checkArrayForMissingInteger(testArray), 4);
	}
	
	@Test
	void test2() {
		int [] testArray = {1,5,7,4,1,2};
		Assertions.assertEquals(MissingIntegerInArraySolution.checkArrayForMissingInteger(testArray), 3);
	}
	
	@Test
	void test3() {
		int [] testArray = {-1, -3};
		Assertions.assertEquals(MissingIntegerInArraySolution.checkArrayForMissingInteger(testArray), 1);
	}

}
