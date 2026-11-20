package com.Online_exam_management_system.model.Users;

import com.Online_exam_management_system.model.BaseModel.BaseModel;
import com.Online_exam_management_system.model.Users.embded.Address;
import com.Online_exam_management_system.model.enums.Role;
import com.Online_exam_management_system.model.enums.Status;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "APP_USER",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_user_username",
                columnNames = "username"
        )
)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class User extends BaseModel<Long> {

    private String username;

    private String password;

    private String fullName;

    private String phoneNumber;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private Status status;

}
