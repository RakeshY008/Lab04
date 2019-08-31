import org.junit.Assert;
import org.junit.Test;

public class Tests {
	Task task = new Task();

	@Test
	public void testWithSimpleValues() {
		Assert.assertEquals(64.9519052838329, task.calculateAreaOfPolygon(6, 5.0), 0.001);
	}

	@Test
	public void test2() {
		Assert.assertEquals(43.01193501472417, task.calculateAreaOfPolygon(5, 5), 0.001);
	}

	@Test
	public void test3() {
		Assert.assertEquals(4.5933635465734595, task.calculateAreaOfPolygon(3, 3.25698), 0.001);
	}
}