import java.util.ArrayList;

public class Student {

  private long id;
  private String name;
  private ArrayList<Integer> grades;

  public Student(String name, long id) {
    this.name = name;
    this.id = id;
    this.grades = new ArrayList<>();
  }

  // returns the student's id
  public long getId() {
    return this.id;
  }

  // returns the student's name
  public String getName() {
    return this.name;
  }

  // adds the given grade to the grades list
  public void addGrade(int grade) {
    this.grades.add(grade);
  }

  // returns the list of grades
  public ArrayList<Integer> getGrades() {
    return this.grades;
  }

  // returns the average of the students grades
  public double getGradeAverage() {
    double amount = this.grades.size();
    double sum = 0;
    for (int grade : grades) {
      sum = sum + grade;
    }
    return sum / amount;
  }

  public static void main(String[] args) {
    Student test = new Student("Test",1);
    test.addGrade(70);
    test.addGrade(71);
    System.out.println(test.getGradeAverage());
    System.out.println(test.getGrades());
  }

}
