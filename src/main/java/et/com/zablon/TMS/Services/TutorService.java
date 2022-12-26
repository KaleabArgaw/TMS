package et.com.zablon.TMS.Services;

import et.com.zablon.TMS.Dtos.TutorInDto;
import et.com.zablon.TMS.Models.*;
import et.com.zablon.TMS.Repositories.TutorRepository;
import et.com.zablon.TMS.Services.FileHandlers.FileHandlerService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Service
public class TutorService extends CrudService<Tutor, Long> {
    private final TutorRepository tutorRepository;
    private final EducationalBackgroundService educationalBackgroundService;
    private final ActiveDaysService activeDaysService;
    private final GradeDistinctionService gradeDistinctionService;
    private final DaysOfWeekService daysOfWeekService;
    private final AddressService addressService;
    private final EducationLevelService educationLevelService;
    private final FileHandlerService fileHandlerService;

    public TutorService(TutorRepository repository,
                        EducationalBackgroundService educationalBackgroundService,
                        ActiveDaysService activeDaysService,
                        GradeDistinctionService gradeDistinctionService,
                        DaysOfWeekService daysOfWeekService,
                        AddressService addressService,
                        EducationLevelService educationLevelService,
                        FileHandlerService fileHandlerService) {
        super(repository, new Tutor());
        this.tutorRepository = repository;
        this.educationalBackgroundService = educationalBackgroundService;
        this.activeDaysService = activeDaysService;
        this.gradeDistinctionService = gradeDistinctionService;
        this.daysOfWeekService = daysOfWeekService;
        this.addressService = addressService;
        this.educationLevelService = educationLevelService;
        this.fileHandlerService = fileHandlerService;
    }

    public Tutor create(TutorInDto request) throws IOException {
        Tutor tutor = new Tutor();
        tutor.setFirstName(request.getFirstName());
        tutor.setLastName(request.getLastName());
        tutor.setDateOfBirth(request.getDateOfBirth());
        tutor.setEmail(request.getEmail());
        tutor.setFullName(request.getFirstName() + " " + request.getLastName());
        tutor.setAge(new Date().getYear() - request.getDateOfBirth().getYear());
        tutor.setGender(request.getGender());

        //Educational Background
        EducationalBackground educationalBackground = new EducationalBackground();
        educationalBackground.setGrade12Result(request.getGrade12Result());
        educationalBackground.setEducationalLevel(educationLevelService.find(request.getEducationalLevel()));
        educationalBackground.setDepartment(request.getDepartment());
        educationalBackground.setHigherLevelResult(request.getHigherLevelResult());
        educationalBackground.setUniversity(request.getUniversity());
        educationalBackground.setSchoolName(request.getSchoolName());
        educationalBackground.setTempo(fileHandlerService.tempoFile(request.getTempo(), request.getFirstName() + request.getLastName()));
        educationalBackground.setResume(fileHandlerService.cvUpload(request.getResume(), request.getFirstName() + request.getLastName()));
        educationalBackground.setKebeleId(fileHandlerService.kebeleId(request.getKebeleId(), request.getFirstName() + request.getLastName()));
        EducationalBackground educationalBackground1 = educationalBackgroundService.create(educationalBackground);
        tutor.setEducationalBackground(educationalBackground1);

        //Available Days
        ActiveDays activeDays = new ActiveDays();
        Set<DayOfWeek> dayOfWeeks = new HashSet<>();
        request.getWeekDays().forEach(weekday -> {
            DayOfWeek dayOfWeek = daysOfWeekService.find(weekday);
            dayOfWeeks.add(dayOfWeek);
        });
        activeDays.setWeekDays(dayOfWeeks);
        ActiveDays activeDays1 = activeDaysService.create(activeDays);
        tutor.setActiveDays(activeDays1);

        //Grade Distinction
        tutor.setGradeDistinction(gradeDistinctionService.find(request.getGradeDistinction()));

        //Address Related
        Address address = new Address();
        address.setCity(request.getCity());
        address.setSubCity(request.getSubCity());
        address.setWoreda(request.getWoreda());
        address.setKebele(request.getKebele());
        address.setZone(request.getZone());
        address.setLongitude(request.getLongitude());
        address.setLatitude(request.getLatitude());
        Address address1 = addressService.create(address);
        tutor.setAddress(address1);
        return create(tutor);
    }

    public List<Tutor> createTutors(List<TutorInDto> tutorInDtoList) {
        List<Tutor> tutors = new ArrayList<>();
        tutorInDtoList.forEach(tutorInDto -> {
            Tutor tutor = new Tutor();
            try {
                tutor = create(tutorInDto);
            } catch (IOException e) {
                e.printStackTrace();
            }
            tutors.add(tutor);
        });
        return tutors;
    }

    public List<Tutor> listByGradeDistinction(Long id) {

        return tutorRepository.findAllByGradeDistinction_Id(id);
    }

    public List<Tutor> listByGradeAndAddress(Long id, String subCity) {

        return tutorRepository.findAllByGradeDistinction_IdOrAddress_SubCity(id, subCity);
    }

}
