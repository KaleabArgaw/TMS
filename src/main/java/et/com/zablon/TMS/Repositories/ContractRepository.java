package et.com.zablon.TMS.Repositories;

import et.com.zablon.TMS.Models.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Long> {
}
