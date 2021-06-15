import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentsTest {
  private Student testStudent;

  @Before
  public void studentTest(){
    testStudent = new Student("Joe",1);
    testStudent.addGrade(70);
    testStudent.addGrade(71);
  }

  @Test
  public void studentNameIDTest(){
    int expectedID = 1;
    String expectedName = "Joe";

    assertEquals(expectedName,testStudent.getName());
    assertEquals(expectedID,testStudent.getId());

  }

  @Test
  public void studentGradesTest(){ //bad test?


    ArrayList<Integer> expectedGrades = new ArrayList<>();
    expectedGrades.add(70);
    expectedGrades.add(71);

//    assertSame(expectedGrades, testStudent.getGrades());
    //Expected :[70, 71]
    //Actual   :[70, 71]
    assertSame(expectedGrades.get(0), testStudent.getGrade(0));
    assertSame(expectedGrades.get(1), testStudent.getGrade(1));


  }


  @Test
  public void studentAverageTest(){

    double expectedAverage = 70.5;
    assertTrue(expectedAverage == testStudent.getGradeAverage());
//    assertEquals(expectedAverage, testStudent.getGradeAverage(), 0.0);//Intelj suggested this?


  }


}
