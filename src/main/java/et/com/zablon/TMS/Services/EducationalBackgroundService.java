package et.com.zablon.TMS.Services;

import et.com.zablon.TMS.Models.EducationalBackground;
import et.com.zablon.TMS.Repositories.EducationalBackgroundRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EducationalBackgroundService extends CrudService<EducationalBackground, Long> {
    private final EducationalBackgroundRepository educationalBackgroundRepository;

    public EducationalBackgroundService(EducationalBackgroundRepository repository) {
        super(repository, new EducationalBackground());
        this.educationalBackgroundRepository = repository;
    }
}
