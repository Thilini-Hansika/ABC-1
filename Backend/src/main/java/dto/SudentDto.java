package dto;

import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * Created by Thilini Hansika on 12/11/2018.
 */
public class SudentDto
{
    private int StudentId;
    private String  name;
    private String StudentAge;

    public SudentDto() {
    }

    public SudentDto(int studentId, String name, String studentAge) {
        StudentId = studentId;
        this.name = name;
        StudentAge = studentAge;
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

    public String getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(String studentAge) {
        StudentAge = studentAge;
    }

    @Override
    public String
    toString() {
        return "SudentDto{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                ", StudentAge='" + StudentAge + '\'' +
                '}';
    }
}
