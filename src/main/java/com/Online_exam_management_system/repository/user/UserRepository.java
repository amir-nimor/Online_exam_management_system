package com.Online_exam_management_system.repository.user;

import com.Online_exam_management_system.model.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
