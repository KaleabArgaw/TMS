package et.com.zablon.TMS.Controllers;

import et.com.zablon.TMS.Dtos.TutorInDto;
import et.com.zablon.TMS.Models.Tutor;
import et.com.zablon.TMS.Services.FileHandlers.TutorExcelImport;
import et.com.zablon.TMS.Services.TutorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/tutor")
@Tag(name = "Tutor")
public class TutorController extends CrudController<Tutor, Long> {
    private final TutorService tutorService;
    private final TutorExcelImport tutorExcelImport;


    @Autowired
    public TutorController(TutorService service, TutorExcelImport tutorExcelImport) {
        super(service);
        this.tutorService = service;
        this.tutorExcelImport = tutorExcelImport;
    }

    @PostMapping("/import")
    public List<Tutor> create(MultipartFile request) throws IOException{
        return tutorExcelImport.excelImport(request);
    }
    @PostMapping("/create")
    public Tutor create(TutorInDto request) throws IOException{
        return tutorService.create(request);
    }

    @GetMapping("/list-by-grade-distinction")
    public List<Tutor> listByGradeDistinction(Long id) {
        return tutorService.listByGradeDistinction(id);
    }

    @GetMapping("/list-by-grade-distinction-and-sub-city")
    public List<Tutor> listByGradeDistinction( @RequestParam(required = false ,value ="Grade") Long id, @RequestParam(required = false ,value ="Sub-City") String subCity) {
        return tutorService.listByGradeAndAddress(id, subCity);
    }
}
