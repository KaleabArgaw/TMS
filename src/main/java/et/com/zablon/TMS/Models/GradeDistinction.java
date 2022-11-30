package et.com.zablon.TMS.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class GradeDistinction extends Model {
    private String description;
    @OneToMany
    private Set<Grade> grade;
}
