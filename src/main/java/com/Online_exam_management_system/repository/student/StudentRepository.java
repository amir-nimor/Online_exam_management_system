package com.Online_exam_management_system.repository.student;

import com.Online_exam_management_system.model.Users.sub.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
