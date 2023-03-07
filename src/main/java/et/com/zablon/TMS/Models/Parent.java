package et.com.zablon.TMS.Models;

import et.com.zablon.TMS.Models.Enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Parent extends Model {
    private String firstName;
    private String lastName;
    private Gender gender;
    private String phoneNumber;
    private boolean isActive;
    @OneToOne
    private Address address;
    @OneToMany
    private Set<Student> student;
}
