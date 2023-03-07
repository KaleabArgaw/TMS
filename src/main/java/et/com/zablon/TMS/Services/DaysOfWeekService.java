package et.com.zablon.TMS.Services;

import et.com.zablon.TMS.Models.DayOfWeek;
import et.com.zablon.TMS.Repositories.DaysOfWeekRepository;
import et.com.zablon.TMS.Utils.BusinessDictionary;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DaysOfWeekService extends CrudService<DayOfWeek, Long> {

    private final DaysOfWeekRepository daysOfWeekRepository;

    public DaysOfWeekService(DaysOfWeekRepository repository) {
        super(repository, new DayOfWeek());
        this.daysOfWeekRepository = repository;
    }

    public void init() {
        Arrays.stream(BusinessDictionary.WEEKDAYS).forEach(weekday -> create(new DayOfWeek(weekday)));
    }

    @Override
    public DayOfWeek create(DayOfWeek dayOfWeek) {
        try {
            DayOfWeek result = daysOfWeekRepository.findByDescription(dayOfWeek.getDescription());
            if (result != null) {
                return result;
            }
            return super.create(dayOfWeek);
        } catch (Exception e) {
            e.printStackTrace();
            throw errorWhileProcessing();
        }
    }
}
