package et.com.zablon.TMS.Dtos;

import et.com.zablon.TMS.Models.DayOfWeek;
import et.com.zablon.TMS.Models.EducationLevel;
import et.com.zablon.TMS.Models.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TutorInDto {
    private String firstName;
    private String lastName;
    private String customId;
    private Gender gender;
    private Date dateOfBirth;
    private int phoneNumber;
    private String email;
    private boolean isActive;

    //Educational
    private String schoolName;
    private int grade12Result;
    private String university;
    private String department;
    private Long educationalLevel;
    private int higherLevelResult;
    private File tempo;
    private File resume;
    private File kebeleId;

    //AvailabilityDays
    private List<Long> weekDays;

    //Grade Distinction
    private Long gradeDistinction;

    //Address Related
    private String city;
    private String subCity;
    private String zone;
    private String woreda;
    private String kebele;
    private String longitude;
    private String latitude;
}
