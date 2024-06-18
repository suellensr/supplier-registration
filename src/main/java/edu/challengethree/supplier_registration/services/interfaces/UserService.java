package edu.challengethree.supplier_registration.services.interfaces;

import edu.challengethree.supplier_registration.dtos.UserDTO;
import edu.challengethree.supplier_registration.exceptions.EmailAlreadyRegisteredException;

public interface UserService {
    UserDTO createUser(UserDTO userDTO) throws EmailAlreadyRegisteredException;;
    UserDTO findByEmail(String email);
}
