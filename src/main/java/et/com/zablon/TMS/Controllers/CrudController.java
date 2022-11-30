package et.com.zablon.TMS.Controllers;


import et.com.zablon.TMS.Services.CrudService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class CrudController<T, ID> {

    private final CrudService<T, ID> crudService;

    public CrudController(CrudService<T, ID> crudService){
        this.crudService = crudService;
    }

    @PostMapping("/add")
    public T create(T obj){
        return crudService.create(obj);
    }

    @GetMapping()
    public T get(ID id){
        return crudService.get(id);
    }

    @GetMapping("/all")
    public List<T> getAll(){
        return crudService.getAll();
    }

    @PutMapping()
    public T update(T obj){
        return crudService.update(obj);
    }

    @DeleteMapping
    public ID delete (ID id){
        return crudService.delete(id);
    }
}
