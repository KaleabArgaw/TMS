package et.com.zablon.TMS.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class StudentDetail extends Model {
    private String description;
    @OneToOne
    private Grade grade;
    private String school;
    private String hobbies;
    private String likes;
    private String dislikes;
}
