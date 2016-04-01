import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;

public class Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {
		Schedule temp = new Schedule();
		List<Work> work = new ArrayList<Work>();
		Work work1 = new Work("1", 1, 1);
		work.add(work1);
		Work work2 = new Work("2", 2, 2);
		work.add(work2);
		Work work3 = new Work("3", 3, 3);
		work.add(work3);
		Work work4 = new Work("4", 4, 4);
		work.add(work4);
		Work work5 = new Work("5", 5, 5);
		work.add(work5);
		temp.SJF(work);
		temp.FCFS(work);
	}

}
