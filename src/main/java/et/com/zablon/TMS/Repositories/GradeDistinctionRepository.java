package et.com.zablon.TMS.Repositories;

import et.com.zablon.TMS.Models.GradeDistinction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeDistinctionRepository extends JpaRepository<GradeDistinction,Long> {
}
