package com.ernestagyemang.productorderservice.service.interfaces;

import com.ernestagyemang.productorderservice.dto.UserInput;
import com.ernestagyemang.productorderservice.model.User;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(UserInput userInput);

    User updateUser(UserInput userInput, Principal principal);

    String deleteUser(Long id);
}
