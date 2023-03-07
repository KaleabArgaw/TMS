package et.com.zablon.TMS.Dtos;

import et.com.zablon.TMS.Models.Enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TutorInDto {
    private String firstName;
    private String lastName;
    private String customId;
    private Gender gender;
    private Date dateOfBirth;
    private String phoneNumber;
    private String email;
    private boolean isActive;

    //Educational
    private String schoolName;
    private String grade12Result;
    private String university;
    private String department;
    private String educationalLevel;
    private String higherLevelResult;
    private MultipartFile tempo;
    private MultipartFile resume;
    private MultipartFile kebeleId;

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
