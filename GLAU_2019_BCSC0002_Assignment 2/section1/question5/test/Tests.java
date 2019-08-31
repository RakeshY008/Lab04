import org.junit.Assert;
import org.junit.Test;

public class Tests {
	Task task = new Task();
	@Test
	public void checkFor10() {
		Assert.assertEquals("00001010", task.convertIntegerToBinaryStringWithAddedBits(10));
	}

	@Test
	public void checkFor127() {
		Assert.assertEquals("01111111", task.convertIntegerToBinaryStringWithAddedBits(127));
	}

	@Test
	public void checkFor128() {
		Assert.assertEquals("10000000", task.convertIntegerToBinaryStringWithAddedBits(128));
	}

	@Test
	public void checkFor0() {
		Assert.assertEquals("00000000", task.convertIntegerToBinaryStringWithAddedBits(0));
	}
}