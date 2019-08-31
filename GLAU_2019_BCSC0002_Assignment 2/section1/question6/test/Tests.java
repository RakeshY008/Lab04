import org.junit.Assert;
import org.junit.Test;

public class Tests {
	Task task = new Task();
	@Test
	public void testSolution() {
		Assert.assertEquals(3.897114317029974, task.calculateAreaOfTriangleWith3Sides(3.0, 3.0, 3.0), 0.001);
	}

	@Test
	public void testSolution2() {
		Assert.assertEquals(17.407231794573196, task.calculateAreaOfTriangleWith3Sides(5.5, 6.5, 7.5), 0.001);
	}

	@Test
	public void checkForZero() {
		Assert.assertEquals(0.0, task.calculateAreaOfTriangleWith3Sides(0, 0, 0), 0.001);
	}
}