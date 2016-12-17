package app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by Chocks on 12/17/16.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @Override
    void delete(Long aLong);
}

