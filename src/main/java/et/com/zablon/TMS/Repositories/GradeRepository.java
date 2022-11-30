package et.com.zablon.TMS.Repositories;

import et.com.zablon.TMS.Models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    Grade findByDescription(String type);
}
