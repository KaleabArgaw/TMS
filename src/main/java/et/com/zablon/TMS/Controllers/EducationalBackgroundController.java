package et.com.zablon.TMS.Controllers;

import et.com.zablon.TMS.Models.EducationalBackground;
import et.com.zablon.TMS.Services.CrudService;
import et.com.zablon.TMS.Services.EducationalBackgroundService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educationBackground")
@Tag(name = "Educational Background")
public class EducationalBackgroundController extends CrudController<EducationalBackground, Long> {
    private final EducationalBackgroundService educationalBackgroundService;

    public EducationalBackgroundController(EducationalBackgroundService service) {
        super(service);
        this.educationalBackgroundService = service;
    }
}
