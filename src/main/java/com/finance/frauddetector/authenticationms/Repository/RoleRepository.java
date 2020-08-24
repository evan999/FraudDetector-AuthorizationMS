package com.finance.frauddetector.authenticationms.Repository;

import com.finance.frauddetector.authenticationms.Model.Role;
import com.finance.frauddetector.authenticationms.Model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
