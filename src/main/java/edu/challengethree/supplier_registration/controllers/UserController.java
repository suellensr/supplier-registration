package edu.challengethree.supplier_registration.controllers;

import edu.challengethree.supplier_registration.dtos.UserDTO;
import edu.challengethree.supplier_registration.exceptions.EmailAlreadyRegisteredException;
import edu.challengethree.supplier_registration.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier-registration-api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserDTO registerUser(@RequestBody UserDTO userDTO) throws EmailAlreadyRegisteredException {
        return userService.createUser(userDTO);
    }

    @GetMapping("/{email}")
    public UserDTO getUserByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }
}