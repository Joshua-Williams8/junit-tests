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

  // gets the given grade at the index
  public int getGrade(int index) {
    return this.grades.get(index);
  }

  // updates the given grade at the index
  public void deleteGrade(int index) {
    this.grades.remove(index);
  }
  // updates the given grade at the index
  public void updateGrade(int index,int newGrade) {
    this.grades.remove(index);
    this.grades.add(index,newGrade);

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

}
