package com.jiffy.jiffy.repository;

import com.jiffy.jiffy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
