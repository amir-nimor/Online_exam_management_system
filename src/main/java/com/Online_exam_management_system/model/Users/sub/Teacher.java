package com.Online_exam_management_system.model.Users.sub;

import com.Online_exam_management_system.model.Users.User;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter

@NoArgsConstructor
@SuperBuilder
public class Teacher extends User {
}
