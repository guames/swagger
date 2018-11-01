package com.ga.swagger.repository;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(description = "This is a class to represent the User object at the system.")
public class User {

    @ApiModelProperty(notes="This atribute is generate automatically and is auto-generated to identify the User object.")
    private Long id;
    @ApiModelProperty(notes="This atribute is the name of the User object.")
    private String name;
    @ApiModelProperty(notes="This atribute is the birthday of the User object.")
    private Date birthDate;

}
