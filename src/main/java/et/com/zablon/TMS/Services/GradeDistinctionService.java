package et.com.zablon.TMS.Services;

import et.com.zablon.TMS.Models.GradeDistinction;
import et.com.zablon.TMS.Repositories.GradeDistinctionRepository;
import org.springframework.stereotype.Service;

@Service
public class GradeDistinctionService extends CrudService<GradeDistinction, Long> {

    private final GradeDistinctionRepository gradeDistinctionRepository;

    public GradeDistinctionService(GradeDistinctionRepository repository) {
        super(repository, new GradeDistinction());
        this.gradeDistinctionRepository = repository;
    }
}
