package com.Online_exam_management_system.dto.teacher;

import com.Online_exam_management_system.dto.Address;
import com.Online_exam_management_system.dto.Role;
import com.Online_exam_management_system.dto.Status;

public record TeacherDtoRequest(
        String username,
        String password,
        String fullName,
        String phoneNumber,
        Address address,
        Role role,
        Status status
) {
}
