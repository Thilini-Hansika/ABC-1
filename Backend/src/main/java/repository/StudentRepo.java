package repository;

import modell.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Thilini Hansika on 12/11/2018.
 */
public interface StudentRepo  extends JpaRepository<Student,Integer> {
}
