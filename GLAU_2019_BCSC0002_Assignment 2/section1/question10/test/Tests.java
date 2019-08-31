import org.junit.Assert;
import org.junit.Test;

public class Tests {
	Task task = new Task();

	@Test
	public void testForLowercaseA() {
		Assert.assertEquals('a', task.asciiToChar(97));
	}

	@Test
	public void testForSpace() {
		Assert.assertEquals(' ', task.asciiToChar(32));
	}

	@Test
	public void testForNull() {
		Assert.assertEquals('\0', task.asciiToChar(0));
	}

	@Test
	public void testForNumber4() {
		Assert.assertEquals('4', task.asciiToChar(52));
	}
}