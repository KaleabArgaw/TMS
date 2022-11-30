package et.com.zablon.TMS.Services;

import et.com.zablon.TMS.Models.Student;
import et.com.zablon.TMS.Repositories.StudentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends CrudService<Student, Long> {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository repository) {
        super(repository, new Student());
        this.studentRepository = repository;
    }
}
