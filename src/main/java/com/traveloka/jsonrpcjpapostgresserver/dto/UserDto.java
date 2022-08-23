package com.traveloka.jsonrpcjpapostgresserver.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
public class UserDto {

    @Id
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;
    private Boolean isActive;
}
