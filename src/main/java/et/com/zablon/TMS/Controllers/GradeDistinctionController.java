package et.com.zablon.TMS.Controllers;

import et.com.zablon.TMS.Models.GradeDistinction;
import et.com.zablon.TMS.Services.CrudService;
import et.com.zablon.TMS.Services.GradeDistinctionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gradeDistinction")
@Tag(name = "Grade Distinction")
public class GradeDistinctionController extends CrudController<GradeDistinction, Long> {
    private final GradeDistinctionService gradeDistinctionService;

    public GradeDistinctionController(GradeDistinctionService service) {
        super(service);
        this.gradeDistinctionService = service;
    }
}
