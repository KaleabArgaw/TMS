package et.com.zablon.TMS.Services;

import et.com.zablon.TMS.Models.ActiveDays;
import et.com.zablon.TMS.Repositories.ActiveDaysRepository;
import org.springframework.stereotype.Service;

@Service
public class ActiveDaysService extends CrudService<ActiveDays, Long> {

    private final ActiveDaysRepository activeDaysRepository;

    public ActiveDaysService(ActiveDaysRepository repository) {
        super(repository, new ActiveDays());
        this.activeDaysRepository = repository;
    }
}
