package edu.challengethree.supplier_registration.services.utils;

import edu.challengethree.supplier_registration.dtos.UserDTO;
import edu.challengethree.supplier_registration.models.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static User userDTOToUser(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        return user;
    }

    public static UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }
}