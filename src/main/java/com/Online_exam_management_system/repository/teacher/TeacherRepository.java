package com.Online_exam_management_system.repository.teacher;

import com.Online_exam_management_system.model.Users.sub.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
