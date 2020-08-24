package com.finance.frauddetector.authenticationms.Repository;

import com.finance.frauddetector.authenticationms.Model.Role;
import com.finance.frauddetector.authenticationms.Model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
