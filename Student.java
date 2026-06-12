import java.util.ArrayList;
import java.util.List;

class Student extends Person{
    private String course;
    private int yearLevel;
    private List<Grade> grades;

    // constructpr
    public Student(String id, String name, int age, String course, int yearLevel) {
        super (id, name, age);
        this.course = course;
        this.yearLevel = yearLevel;
        this.grades = new ArrayList<>();
    }
    
    // 
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // 
    public int getYearLevel() {
        return yearLevel;
    }

    public  void setYearLevel(int yearLevel) {
        if (yearLevel > 1 && yearLevel <= 6) {
            this.yearLevel = yearLevel;
        } 
        else {
            System.out.println("invalid year level");
        }
    }

    //
    public void addGrade(String subject, double score) {
        grades.add(new Grade(subject, score));
    } 

    // 
    public double getGPA() {
        if(grades.isEmpty()) {
            return 0.0;
        }
        double total = 0;

        for(Grade g : grades) {
            total += g.getScore();
        }

        return total / grades.size();
    }

    public List<Grade> getGrade() {
        return grades;
    }

    // for abstract 
    @Override
    public void displayInfo() {
        System.out.println("-------------------------------");
        System.out.println("Student ID: " + getId());
        System.out.println("Student ID: " + getName());
        System.out.println("Student ID: " + getAge());
        System.out.println("Student ID: " + course);
        System.out.println("Student ID: " + getId());
        System.out.println("Student ID: " + getGPA());
    }
    public String getRole() {
        return "Student";
    };
}
