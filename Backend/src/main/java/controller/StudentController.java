package controller;

import dto.SudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import java.util.ArrayList;

/**
 * Created by Thilini Hansika on 12/11/2018.
 */


@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveStudent(@RequestBody SudentDto student) {
        return studentService.saveStudent(student);
    }



    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteStudent(@PathVariable("id") int id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping( value = "/count"  ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<SudentDto> getAllStudents() {
        return studentService.getAllStudent();
    }


}
