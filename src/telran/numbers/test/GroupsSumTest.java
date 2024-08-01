package telran.numbers.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import telran.numbers.*;
class GroupsSumTest {
private static final int N_GROUPS = 1000;
private static final int GROUP_LENGTH = 1000;
int[][] groups = {
		{1,2},
		{3,4},
		{5,6}
};
int[][] largeGroups = getLargeGroups(N_GROUPS, GROUP_LENGTH);
	@Test
	void goupsSumTaskThreadTest() {
		GroupsSum gs = new GroupsSumTaskThread(groups);
		assertEquals(21, gs.getSum());
	}
	private int[][] getLargeGroups(int nGroups, int groupLength) {
		// TODO creating random two dimensional array 
		// using method generate of Stream
		return null;
	}
	@Test
	void goupsSumThreadPoolTest() {
		GroupsSum gs = new GroupsSumThreadPool(groups);
		assertEquals(21, gs.getSum());
	}
	@Test
	void groupsSumTaskThreadPerformance() {
		new GroupsSumTaskThread(largeGroups).getSum();
	}
	@Test
	void groupsSumTaskThreadPoolsPerformance() {
		new GroupsSumThreadPool(largeGroups).getSum();
	}

}
