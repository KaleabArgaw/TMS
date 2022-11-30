package et.com.zablon.TMS.Services;

import et.com.zablon.TMS.Models.Address;
import et.com.zablon.TMS.Repositories.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends CrudService<Address, Long> {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository repository) {
        super(repository, new Address());
        this.addressRepository = repository;
    }
}
