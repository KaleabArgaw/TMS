package et.com.zablon.TMS.Services;

import et.com.zablon.TMS.Models.Contract;
import et.com.zablon.TMS.Repositories.ContractRepository;

public class ContractService extends CrudService<Contract, Long> {
    private final ContractRepository contractRepository;


    public ContractService(ContractRepository repository) {
        super(repository, new Contract());
        this.contractRepository = repository;
    }
}
