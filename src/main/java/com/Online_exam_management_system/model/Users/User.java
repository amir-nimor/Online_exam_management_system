package com.Online_exam_management_system.model.Users;

import com.Online_exam_management_system.model.BaseModel.BaseModel;
import com.Online_exam_management_system.model.Users.embded.Address;
import com.Online_exam_management_system.model.enums.Role;
import com.Online_exam_management_system.model.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.jspecify.annotations.Nullable;

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

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String phoneNumber;

    @Embedded @Column(nullable = false)
    private Address address;

    @Enumerated(EnumType.STRING) @Column(nullable = false)
    private Role role;

    @Enumerated(EnumType.STRING) @Column(nullable = false)
    private Status status;

}
