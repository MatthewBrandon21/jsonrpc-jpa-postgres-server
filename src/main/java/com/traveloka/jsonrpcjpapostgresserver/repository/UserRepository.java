package com.traveloka.jsonrpcjpapostgresserver.repository;

import com.traveloka.jsonrpcjpapostgresserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
