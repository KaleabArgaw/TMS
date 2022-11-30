package et.com.zablon.TMS.Controllers;

import et.com.zablon.TMS.Models.Grade;
import et.com.zablon.TMS.Services.CrudService;
import et.com.zablon.TMS.Services.GradeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grade")
@Tag(name = "Grade")
public class GradeController extends CrudController<Grade,Long> {
    private final GradeService gradeService;

    public GradeController(GradeService service) {
        super(service);
        this.gradeService = service;
    }
}
