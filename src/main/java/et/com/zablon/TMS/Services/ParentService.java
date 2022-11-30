package et.com.zablon.TMS.Services;

import et.com.zablon.TMS.Models.Parent;
import et.com.zablon.TMS.Repositories.ParentRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public class ParentService extends CrudService<Parent,Long> {
    private final ParentRepository parentRepository;

    public ParentService(ParentRepository repository) {
        super(repository, new Parent());
        this.parentRepository = repository;
    }
}
