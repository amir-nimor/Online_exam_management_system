package com.Online_exam_management_system.command;

import com.Online_exam_management_system.dto.teacher.TeacherDtoRequest;
import com.Online_exam_management_system.dto.teacher.TeacherDtoResponse;
import com.Online_exam_management_system.dto.user.UserDtoRequest;
import com.Online_exam_management_system.dto.user.UserDtoResponse;
import com.Online_exam_management_system.model.Users.User;
import com.Online_exam_management_system.model.Users.sub.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherCommand {

    Teacher dtoToDao(TeacherDtoRequest teacherDtoRequest);

    TeacherDtoResponse daoToDto(Teacher teacher);
}
