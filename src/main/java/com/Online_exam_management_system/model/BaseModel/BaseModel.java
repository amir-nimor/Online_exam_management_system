package com.Online_exam_management_system.model.BaseModel;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@MappedSuperclass

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseModel <ID extends Number>{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;
}
