package et.com.zablon.TMS.Controllers;

import et.com.zablon.TMS.Dtos.TutorInDto;
import et.com.zablon.TMS.Models.Tutor;
import et.com.zablon.TMS.Services.CrudService;
import et.com.zablon.TMS.Services.TutorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping("/tutor")
@Tag(name = "Tutor")
public class TutorController extends CrudController<Tutor, Long> {
    private final TutorService tutorService;

    @Autowired
    public TutorController(TutorService service) {
        super(service);
        this.tutorService = service;
    }


    @PostMapping("/create")
    public Tutor create(@RequestBody TutorInDto request) throws IOException {
        return tutorService.create(request);
    }
}
