package tda.darkarmy.onlinecrimereportingportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tda.darkarmy.onlinecrimereportingportal.model.Role;
import tda.darkarmy.onlinecrimereportingportal.model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long> {
    Roles findByRoleName(Role role);
}
