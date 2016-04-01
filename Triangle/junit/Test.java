import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;

public class Test {
	Triangle temp;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {
		temp = new Triangle(0, 0, 0);
		temp.getType(temp);
		temp = new Triangle(6, 3, 3);
		temp.getType(temp);
		temp = new Triangle(100, 100, 100);
		temp.getType(temp);
		temp = new Triangle(50,40,40);
		temp.getType(temp);
		temp = new Triangle(99, 100, 101);
		temp.getType(temp);
	}

}
