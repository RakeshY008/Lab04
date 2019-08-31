import org.junit.Assert;
import org.junit.Test;

public class Tests {
	Task task = new Task();

	@Test
	public void testSolution() {
		Assert.assertEquals("input 3 4 5", 5.0, task.maximumOfThreeNumbers(3.0, 4.0, 5.0), 0.001);
	}

	@Test
	public void testSolution1() {
		Assert.assertEquals("input 5 4 3", 5.0, task.maximumOfThreeNumbers(5.0, 4.0, 3.0), 0.001);
	}

	@Test
	public void testSolution2() {
		Assert.assertEquals("input 5 3 4", 5.0, task.maximumOfThreeNumbers(5.0, 3.0, 4.0), 0.001);
	}

	@Test
	public void testSolution3() {
		Assert.assertEquals("input 3 3 3", 3.0, task.maximumOfThreeNumbers(3.0, 3.0, 3.0), 0.001);
	}


}