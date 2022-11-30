package et.com.zablon.TMS.Controllers;

import et.com.zablon.TMS.Models.Student;
import et.com.zablon.TMS.Services.StudentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@Tag(name = "Student")
public class StudentController extends CrudController<Student, Long> {
    private final StudentService studentService;

    public StudentController(StudentService service) {
        super(service);
        this.studentService = service;
    }
}
