package et.com.zablon.TMS.Controllers;

import et.com.zablon.TMS.Models.Address;
import et.com.zablon.TMS.Services.AddressService;
import et.com.zablon.TMS.Services.CrudService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@Tag(name = "Address")
public class AddressController extends CrudController<Address, Long> {
    private final AddressService addressService;

    public AddressController(AddressService service) {
        super(service);
        this.addressService = service;
    }
}
