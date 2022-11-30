package et.com.zablon.TMS.Repositories;

import et.com.zablon.TMS.Models.DayOfWeek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaysOfWeekRepository extends JpaRepository<DayOfWeek,Long> {
    DayOfWeek findByDescription(String type);
}
