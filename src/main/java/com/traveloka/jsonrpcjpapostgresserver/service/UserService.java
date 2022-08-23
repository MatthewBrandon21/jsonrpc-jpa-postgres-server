package com.traveloka.jsonrpcjpapostgresserver.service;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;
import com.traveloka.jsonrpcjpapostgresserver.dto.UserDto;
import com.traveloka.jsonrpcjpapostgresserver.model.User;

import java.util.List;

@JsonRpcService("/api")
public interface UserService {
    User create(@JsonRpcParam(value = "user") User user);
    User update(@JsonRpcParam(value = "user_id") Long id, @JsonRpcParam(value = "user") User user);
    List<User> findAll(@JsonRpcParam(value = "user_id") Long id);
    User findById(@JsonRpcParam(value = "user_id") Long id);

    UserDto mapToDto(User user);
    User mapToEntity(UserDto userDto);
}
