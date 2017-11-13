package kasatkin.andrew.spring.boot.demo.repository;

import kasatkin.andrew.spring.boot.demo.entity.Role;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by Drew on 13.11.2017.
 */
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
