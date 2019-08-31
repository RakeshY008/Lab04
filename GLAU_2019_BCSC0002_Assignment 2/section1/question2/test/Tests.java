import org.junit.Assert;
import org.junit.Test;

public class Tests {
	Task task = new Task();
	@Test
	public void testCircumference1() {
		Assert.assertEquals(18.84955592153876, task.calculateCircumference(3.0), 0.001);
	}

	@Test
	public void testCircumference2() {
		Assert.assertEquals(35.18583772020568, task.calculateCircumference(5.6), 0.001);
	}

	@Test
	public void testCircumference3() {
		Assert.assertEquals(31.41592653589793, task.calculateCircumference(5), 0.001);
	}
}