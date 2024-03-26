package com.api.crud.services;

import com.api.crud.dto.UserDTO;
import com.api.crud.models.UserModel;

import java.util.ArrayList;

public interface UserService {

    public ArrayList<UserModel> getUsers();
    public UserModel saveUser(UserModel user);
    public UserDTO getById(Long id);
    public UserModel uptdateById(UserModel request, Long id);
    public Boolean deleteUser(Long id);
}
