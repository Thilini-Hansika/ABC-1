package modell;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Thilini Hansika on 12/11/2018.
 */

@Entity
public class Student {

    @Id
    private int StudentId;
    private String name;
    private String SudentAge;


    public Student() {
    }

    public Student(int studentId, String name, String sudentAge) {
        StudentId = studentId;
        this.name = name;
        SudentAge = sudentAge;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSudentAge() {
        return SudentAge;
    }

    public void setSudentAge(String sudentAge) {
        SudentAge = sudentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                ", SudentAge='" + SudentAge + '\'' +
                '}';
    }
}
