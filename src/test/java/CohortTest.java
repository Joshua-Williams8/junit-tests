import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CohortTest {
  private Cohort neptune;

  @Before
  public void setUp(){
    neptune = new Cohort();

    neptune.addStudent(new Student("Antonio",1));
    neptune.addStudent(new Student("Michael",2));
    neptune.addStudent(new Student("Fernando",3));

//    Student one = new Student("Antonio",1);
//    Student two = new Student("Michael",2);
//    Student tres = new Student("Fernando",3);
//
//    neptune.addStudent(one);
//    neptune.addStudent(two);
//    neptune.addStudent(tres);




    neptune.getStudents().get(0).addGrade(70);
    neptune.getStudents().get(0).addGrade(75);
    neptune.getStudents().get(1).addGrade(80);
    neptune.getStudents().get(1).addGrade(85);
    neptune.getStudents().get(2).addGrade(90);
    neptune.getStudents().get(2).addGrade(95);

  }

  @Test
  public void setUpTest(){
    assertEquals("Antonio",neptune.getStudents().get(0).getName());
    assertEquals(90,neptune.getStudents().get(2).getGrade(0));
    assertEquals(82.5, neptune.getStudents().get(1).getGradeAverage(), 0.0);
    //Remember you need the delta for floating point numbers.
  }

  @Test
  public void cohortAv(){
    double expectedAv = 0;
    expectedAv += 70;
    expectedAv += 75;
    expectedAv += 80;
    expectedAv += 85;
    expectedAv += 90;
    expectedAv += 95;
    expectedAv /= 6;

    assertEquals(expectedAv,neptune.getCohortAverage(),0.0);
  }

  @Test
  public void removeTest(){
    neptune.removeStudent(0);

    assertNotEquals("Antonio",neptune.getStudents().get(0).getName());
    assertEquals("Michael",neptune.getStudents().get(0).getName());


  }

}
