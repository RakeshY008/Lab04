import org.junit.Assert;
import org.junit.Test;

public class Tests {
	private Task task = new Task();
	@Test
	public void testSolution() {
		Assert.assertEquals(9, task.addTwoNumbers(4, 5));
	}
}