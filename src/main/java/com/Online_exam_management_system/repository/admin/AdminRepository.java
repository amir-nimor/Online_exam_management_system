package com.Online_exam_management_system.repository.admin;

import com.Online_exam_management_system.model.Users.sub.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
