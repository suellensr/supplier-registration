package edu.challengethree.supplier_registration.services.impl;

import edu.challengethree.supplier_registration.dtos.UserDTO;
import edu.challengethree.supplier_registration.models.entities.User;
import edu.challengethree.supplier_registration.exceptions.EmailAlreadyRegisteredException;
import edu.challengethree.supplier_registration.exceptions.ResourceNotFoundException;
import edu.challengethree.supplier_registration.services.interfaces.UserService;
import edu.challengethree.supplier_registration.services.utils.UserMapper;
import edu.challengethree.supplier_registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; //A Spring Security's component used to encode passwords using the BCrypt algorithm.

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        if (userRepository.findByEmail(userDTO.getEmail()) != null) {
            throw new EmailAlreadyRegisteredException("This email is already registered");
        }
        User user = UserMapper.userDTOToUser(userDTO);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return UserMapper.userToUserDTO(user);
    }

    @Override
    public UserDTO findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new ResourceNotFoundException("This email is NOT registered");
        }
        return UserMapper.userToUserDTO(user);
    }
}
