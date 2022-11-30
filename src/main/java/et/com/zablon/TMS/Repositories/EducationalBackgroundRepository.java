package et.com.zablon.TMS.Repositories;

import et.com.zablon.TMS.Models.EducationalBackground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationalBackgroundRepository extends JpaRepository<EducationalBackground,Long> {
}
