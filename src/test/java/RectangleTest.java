import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {

  @Test
  public void newRectangle_instantiatesCorrectly() {
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(true, testRectangle instanceof Rectangle);
  }

  @Test
  public void newRectangle_getsLengthOfRectangle_2() {
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(2, testRectangle.getLength());
  }
  @Test
  public void getWidth_getsRectangleWidth_4() {
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(4, testRectangle.getWidth());
  }
  @Test
  public void isSquare_testsToMAkeSureRectangleIsNotASquare_true() {
  Rectangle testRectangle = new Rectangle(5, 5);
  assertEquals(true, testRectangle.isSquare());
}
}
