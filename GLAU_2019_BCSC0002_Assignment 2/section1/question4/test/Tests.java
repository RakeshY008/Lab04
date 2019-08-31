import org.junit.Assert;
import org.junit.Test;

public class Tests {
  Task task = new Task();
  @Test
  public void checkFor22() {
    Assert.assertEquals("10110", task.convertIntegerToBinaryString(22));
  }

  @Test
  public void checkFor45() {
    Assert.assertEquals("101101", task.convertIntegerToBinaryString(45));
  }

  @Test
  public void checkFor0() {
    Assert.assertEquals("0", task.convertIntegerToBinaryString(0));
  }

  @Test
  public void checkFor10() {
    Assert.assertEquals("1010", task.convertIntegerToBinaryString(10));
  }
}