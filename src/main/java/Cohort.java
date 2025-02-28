import java.util.ArrayList;
import java.util.List;

public class Cohort {

  private List<Student> students;

  public Cohort() {
    this.students = new ArrayList<>();
  }

  public double getCohortAverage() {
    double avg = 0;
    for (Student student: this.getStudents()) {
      avg += student.getGradeAverage();
    }
    return avg / this.getStudents().size();
  }

  public void addStudent(Student student){
    this.students.add(student);
  }

  public void removeStudent(int index){
    this.students.remove(index);
  }

  public List<Student> getStudents() {
    return this.students;
  }
}
