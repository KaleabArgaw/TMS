package et.com.zablon.TMS.Models;

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
    private int phoneNumber;
    private boolean isActive;
    @Transient
    private String fullName;
    @OneToOne
    private Address address;
    @OneToMany
    private Set<Student> student;
}
