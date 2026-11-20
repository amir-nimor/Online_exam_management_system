package com.Online_exam_management_system.dto.user;

import com.Online_exam_management_system.dto.Address;
import com.Online_exam_management_system.dto.Role;
import com.Online_exam_management_system.dto.Status;

public record UserDtoResponse (
        Long id,
        String username,
        String fullName,
        String phoneNumber,
        Address address,
        Role role,
        Status status
){
}
