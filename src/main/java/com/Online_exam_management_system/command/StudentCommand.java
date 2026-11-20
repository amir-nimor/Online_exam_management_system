package com.Online_exam_management_system.command;

import com.Online_exam_management_system.dto.student.StudentDtoRequest;
import com.Online_exam_management_system.dto.student.StudentDtoResponse;
import com.Online_exam_management_system.dto.teacher.TeacherDtoRequest;
import com.Online_exam_management_system.dto.teacher.TeacherDtoResponse;
import com.Online_exam_management_system.model.Users.sub.Student;
import com.Online_exam_management_system.model.Users.sub.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentCommand {

    Student dtoToDao(StudentDtoRequest studentDtoRequest);

    StudentDtoResponse daoToDto(Student student);
}
