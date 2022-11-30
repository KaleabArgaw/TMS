package et.com.zablon.TMS.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.File;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationalBackground extends Model {
    //HighSchool Grade Result
    private String schoolName;
    private int grade12Result;

    //Higher Grade Result
    private String university;
    private String department;
    private EducationLevel educationalLevel;
    private int higherLevelResult;
    private byte[] tempo;
    private byte[] resume;
    private byte[] kebeleId;

}
