package com.Online_exam_management_system.command;

import com.Online_exam_management_system.dto.admin.AdminDtoRequest;
import com.Online_exam_management_system.dto.admin.AdminDtoResponse;
import com.Online_exam_management_system.dto.student.StudentDtoRequest;
import com.Online_exam_management_system.dto.student.StudentDtoResponse;
import com.Online_exam_management_system.model.Users.sub.Admin;
import com.Online_exam_management_system.model.Users.sub.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdminCommand {

    Admin dtoToDao(AdminDtoRequest adminDtoRequest);

    AdminDtoResponse daoToDto(Admin admin);
}
