package et.com.zablon.TMS.Controllers;

import et.com.zablon.TMS.Models.ActiveDays;
import et.com.zablon.TMS.Services.ActiveDaysService;
import et.com.zablon.TMS.Services.CrudService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activeDays")
@Tag(name = "Active Days")
public class ActiveDaysController extends CrudController<ActiveDays,Long> {

    private final ActiveDaysService activeDaysService;

    public ActiveDaysController(ActiveDaysService service) {
        super(service);
        this.activeDaysService = service;
    }
}
