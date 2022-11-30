package et.com.zablon.TMS.Repositories;

import et.com.zablon.TMS.Models.ActiveDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveDaysRepository extends JpaRepository<ActiveDays,Long> {
}
