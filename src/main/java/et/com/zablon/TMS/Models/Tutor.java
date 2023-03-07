package et.com.zablon.TMS.Models;

import et.com.zablon.TMS.Models.Enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Tutor extends Model {
    private String firstName;
    private String lastName;
    private String customId;
    private Gender gender;
    private Date dateOfBirth;
    private String phoneNumber;
    private String email;
    private boolean isActive;
    @OneToOne
    EducationalBackground educationalBackground;
    @OneToOne
    private ActiveDays activeDays;
    @OneToOne
    private GradeDistinction gradeDistinction;
    @OneToOne
    private Address address;
    @OneToMany
    private Set<Contract> contracts;


}
