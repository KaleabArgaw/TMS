package et.com.zablon.TMS.Controllers;

import et.com.zablon.TMS.Models.DayOfWeek;
import et.com.zablon.TMS.Services.DaysOfWeekService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/days-of-week-controller")
@Tag(name = "Week Days")
public class DaysOfWeekController extends CrudController<DayOfWeek,Long> {

    private final DaysOfWeekService daysOfWeekService;
    public DaysOfWeekController(DaysOfWeekService service) {
        super(service);
        this.daysOfWeekService = service;
    }
}
