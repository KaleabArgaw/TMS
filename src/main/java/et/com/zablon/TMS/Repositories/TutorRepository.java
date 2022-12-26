package et.com.zablon.TMS.Repositories;

import et.com.zablon.TMS.Models.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorRepository extends JpaRepository<Tutor,Long> {
    List<Tutor> findAllByGradeDistinction_Id(Long id);
    List<Tutor> findAllByGradeDistinction_IdOrAddress_SubCity(Long id,String subCity);
}
