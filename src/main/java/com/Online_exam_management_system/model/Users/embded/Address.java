package com.Online_exam_management_system.model.Users.embded;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String city;

    private String Street;

    private String postalCode;
}
