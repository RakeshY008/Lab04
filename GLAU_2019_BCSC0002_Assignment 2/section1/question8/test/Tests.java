import org.junit.Assert;
import org.junit.Test;

public class Tests {
	Task task = new Task();

	@Test
	public void checkFor4and5() {
		Assert.assertEquals("Input(4, 5)", "00000100", task.booleanAnd(4, 5));
	}

	@Test
	public void checkFor2and2() {
		Assert.assertEquals("Input(2, 2)", "00000010", task.booleanAnd(2, 2));
	}

	@Test
	public void checkFor0and0() {
		Assert.assertEquals("Input(2, 2)", "00000000", task.booleanAnd(0, 0));
	}

}