package et.com.zablon.TMS.Models;

import et.com.zablon.TMS.Models.Enums.EducationLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationalBackground extends Model {
    //HighSchool Grade Result
    private String schoolName;
    private String grade12Result;

    //Higher Grade Result
    private String university;
    private String department;
    private EducationLevel educationalLevel;
    private String higherLevelResult;
    private byte[] tempo;
    private byte[] resume;
    private byte[] kebeleId;

}
