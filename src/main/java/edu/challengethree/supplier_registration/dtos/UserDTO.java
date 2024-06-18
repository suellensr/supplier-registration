package edu.challengethree.supplier_registration.dtos;

import jakarta.validation.constraints.NotNull;

public class UserDTO {

    @NotNull
    private String email;

    @NotNull
    private String password;

    public UserDTO() {}

    public UserDTO(String email, String password) {}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
