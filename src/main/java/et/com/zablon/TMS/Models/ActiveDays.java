package et.com.zablon.TMS.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ActiveDays extends Model {
    @ManyToMany
    private Set<DayOfWeek> weekDays;
}
