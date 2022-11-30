package et.com.zablon.TMS.Services;

import et.com.zablon.TMS.Models.Grade;
import et.com.zablon.TMS.Repositories.GradeRepository;
import et.com.zablon.TMS.Utils.BusinessDictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class GradeService extends CrudService<Grade, Long> {
    private final GradeRepository gradeRepository;

    public GradeService(GradeRepository repository) {
        super(repository, new Grade());
        this.gradeRepository = repository;
    }

    public void init() {
        Arrays.stream(BusinessDictionary.GRADES).forEach(grade -> create(new Grade(grade)));
    }

    @Override
    public Grade create(Grade grade) {
        try {
            Grade result = gradeRepository.findByDescription(grade.getDescription());
            if (result != null) {
                return result;
            }
            return super.create(grade);
        } catch (Exception e) {
            e.printStackTrace();
            throw errorWhileProcessing();
        }
    }
}
