package com.traveloka.jsonrpcjpapostgresserver.service;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import com.traveloka.jsonrpcjpapostgresserver.dto.UserDto;
import com.traveloka.jsonrpcjpapostgresserver.model.User;
import com.traveloka.jsonrpcjpapostgresserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AutoJsonRpcServiceImpl
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(User user) {
        final User result = userRepository.save(user);
        return result;
    }

    @Override
    public User update(Long id, User user) {
        final User result = findById(id);
        if (result != null) {
            result.setEmail(user.getEmail());
            result.setName(user.getName());
            result.setPassword(user.getPassword());
            result.setUsername(user.getUsername());
            result.setIsActive(user.getIsActive());
            return userRepository.save(result);
        }
        return null;
    }

    @Override
    public List<User> findAll(Long id) {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        final Optional<User> result = userRepository.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        return null;
    }

    @Override
    public UserDto mapToDto(User user) {
        return null;
    }

    @Override
    public User mapToEntity(UserDto userDto) {
        return null;
    }
}
