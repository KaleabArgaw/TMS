package et.com.zablon.TMS.Models;

import et.com.zablon.TMS.Models.Enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student extends Model{

    private String firstName;
    private String lastName;
    private String customId;
    private Date dateOfBirth;
    private String phoneNumber;
    private boolean isActive;
    private Gender gender;
    @OneToOne
    private StudentDetail studentDetail;
    @OneToOne
    private Address address;
    @OneToMany
    private Set<Contract> contracts;
}
