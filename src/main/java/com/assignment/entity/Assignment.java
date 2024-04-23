package com.assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@Builder
public class Assignment {

    @Id
    private String employeeId;

    @Field("deptId")
    private String departmentId;
}
