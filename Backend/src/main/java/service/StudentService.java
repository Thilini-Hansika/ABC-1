package service;

import dto.SudentDto;

import java.util.ArrayList;

/**
 * Created by Thilini Hansika on 12/11/2018.
 */
public interface StudentService {

    public boolean saveStudent(SudentDto  dto);
    public boolean deleteStudent(int  id);
    public SudentDto searchStudent(int  id);
    public ArrayList<SudentDto> getAllStudent();
}
