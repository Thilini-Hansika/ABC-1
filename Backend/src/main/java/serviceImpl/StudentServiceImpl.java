package serviceImpl;

import dto.SudentDto;
import modell.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import repository.StudentRepo;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thilini Hansika on 12/11/2018.
 */



@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StudentServiceImpl  implements StudentService{
    @Autowired
  private   StudentRepo  studentRepo;


    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveStudent(SudentDto dto) {
        Student student=new Student();
        student.setStudentId(dto.getStudentId());
        student.setName(dto.getName());
        student.setSudentAge(dto.getStudentAge());
        studentRepo.save(student);

            return true;
    }

    public boolean deleteStudent(int id) {

        studentRepo.deleteById(id);
        return true;

    }

    public SudentDto searchStudent(int id) {
//        Student student = studentRepo.findById(id).get();
//        SudentDto dto = new SudentDto(student.getStudentId(), student.getName(), student.getSudentAge());
//        return dto;
        return null;
    }

    public ArrayList<SudentDto> getAllStudent() {

        List<Student> students=studentRepo.findAll();

        ArrayList<SudentDto> allStudents=new ArrayList<SudentDto>();

        for (Student student:students
             ) {
            SudentDto dto=new SudentDto(
                    student.getStudentId(),student.getName(),student.getSudentAge()
            );

                   allStudents.add(dto);
        }
        return allStudents;

    }
}
