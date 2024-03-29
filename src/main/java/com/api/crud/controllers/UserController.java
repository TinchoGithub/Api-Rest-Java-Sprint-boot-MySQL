package com.api.crud.controllers;

import com.api.crud.dto.UserDTO;
import com.api.crud.models.UserModel;
import com.api.crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getAll")
    public List<UserDTO> getUsers(){
        return this.userService.getUsers();
    }

    @PostMapping("save")
    public UserModel saveUser(@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/getId/{id}")
    public UserDTO getUserById(@PathVariable Long id){
        return this.userService.getById(id);
    }

    @PutMapping(path = "/update/{id}")
    public UserModel updateUserById(@RequestBody UserModel request,@PathVariable("id") Long id){
        return this.userService.uptdateById(request, id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteById(@PathVariable("id") Long id ){
        boolean ok = this.userService.deleteUser(id);

        if(ok){
            return "El usuario "+id+" ha sido eliminado!";
        }else {
            return "Error, hubo un problema al querer eliminar el usuario "+ id;
        }
    }


}
