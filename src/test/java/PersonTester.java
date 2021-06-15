import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTester {



  @Test
  public void testPerson(){
    Person dave = new Person("Dave");
    Person daveDos = new Person("Dave");
    Person dude = new Person("Dude", true);
    Person bruh = new Person("Bruh", false);



//    assertEquals(dave, daveDos);
//    assertSame(dave, daveDos);
    assertEquals("Dave", daveDos.getName());
    assertTrue(dude.isCool());
    assertTrue("cool dude", dude.isCool());//This is more for a description for the person looking at the test, (the string)
//    assertTrue("not cool dude", bruh.isCool());
//    assertFalse("not cool dude", bruh.isCool());



//    assertTrue(bruh.isCool());


  }
  @Test
  public void arrayTest(){
    int[] arrayOfInts = {1,2,3,4}; //different lengths cause a fail
    int[] otherInts = {1,2,3,4}; //different content, at certain indexs, will cause a fail.


//    assertEquals(arrayOfInts, otherInts); //checks addresses in memory.
    assertArrayEquals(arrayOfInts, otherInts);

  }

}
