import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

  private String expected;

  @Before //Do this stuff before the test.
  public void setUp(){
    expected = "bruh";
  }

  @Test(expected = IllegalArgumentException.class)
  //throw notes, put what's next to test, and pass exceptions
  public void testIfHelloWorks(){
    String expected = "Hello World";
    //Yellow x means the code ran, but it didn't get what we expected.
    //Green means good to go.
    //expected is what we expect to be the result when we call this function with the given parameters.
    //This is currently just taking a look at the return.

//    assertEquals(expected,HelloWorld.hello()); //We only get the first part that fails back?
    assertEquals("Hello null",HelloWorld.hello(null)); //We only get the first part that fails back?
    //Throw related notes below with null:
    //Shows a red test instead now...
    //

    assertEquals("Hello Josh",HelloWorld.hello("Josh"));
    assertNotEquals("Hello null", HelloWorld.hello());
    assertNotNull("Hello null",HelloWorld.hello());
  }


}
