import static org.junit.Assert.*;

import javax.xml.transform.Templates;

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
		int a[]={20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		Sorting temp = new Sorting();
		temp.isSorted(a);
		temp.insertionSort(a);
		temp.isSorted(a);
		int b[]={20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		temp.quicksort(b);
	}

}
