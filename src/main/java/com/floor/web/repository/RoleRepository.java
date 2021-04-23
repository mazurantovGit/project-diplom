package com.floor.web.repository;

import com.floor.web.entity.Role;
import com.floor.web.utils.Constants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {

    Optional<Role> findByName(Constants.ERole role);
}
