package com.Online_exam_management_system.command;

import com.Online_exam_management_system.dto.user.UserDtoRequest;
import com.Online_exam_management_system.dto.user.UserDtoResponse;
import com.Online_exam_management_system.model.Users.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserCommand {

    User dtoToDao(UserDtoRequest userDtoRequest);

    UserDtoResponse daoToDto(User user);
}
