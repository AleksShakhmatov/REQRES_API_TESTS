package models;

import lombok.Data;

@Data
public class UserRegisterRequestModel {
    String email, password;
}