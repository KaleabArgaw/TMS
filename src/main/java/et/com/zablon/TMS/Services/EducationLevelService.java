//package et.com.zablon.TMS.Services;
//
//import et.com.zablon.TMS.Models.Enums.EducationLevel;
//import et.com.zablon.TMS.Repositories.EducationLevelRepository;
//import et.com.zablon.TMS.Utils.BusinessDictionary;
//import org.springframework.stereotype.Repository;
//
//import java.util.Arrays;
//
//@Repository
//public class EducationLevelService extends CrudService<EducationLevel, Long> {
//
//    private final EducationLevelRepository repository;
//
//    public EducationLevelService(EducationLevelRepository repository) {
//        super(repository, new EducationLevel());
//        this.repository = repository;
//    }
//
//    public void init() {
//        Arrays.stream(BusinessDictionary.EDUCATION_LEVEL).forEach(statusType -> create(new EducationLevel(statusType)));
//    }
//
//
//    @Override
//    public EducationLevel create(EducationLevel educationLevel) {
//        try {
//            EducationLevel result = repository.findByDescription(educationLevel.getDescription());
//            if (result != null) {
//                return result;
//            }
//            return super.create(educationLevel);
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw errorWhileProcessing();
//        }
//    }
//}
