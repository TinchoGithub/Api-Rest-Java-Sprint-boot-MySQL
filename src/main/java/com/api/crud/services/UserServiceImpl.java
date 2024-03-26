package com.api.crud.services;

import com.api.crud.dto.UserDTO;
import com.api.crud.models.UserModel;
import com.api.crud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getUsers() {
        List<UserModel> users = userRepository.findAll();
        return users.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    @Override
    public UserDTO getById(Long id) {
        final Optional<UserModel> usuarioEncontrado = userRepository.findById(id);
        final UserModel usuarioDB = usuarioEncontrado.get();
        return new UserDTO(usuarioDB.getFirstName(), usuarioDB.getLastName(), usuarioDB.getEmail(), usuarioDB.getAddress());
    }

    @Override
    public UserModel uptdateById(UserModel request, Long id) {
        UserModel user = userRepository.findById(id).get();

        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());

        return user;
    }

    @Override
    public Boolean deleteUser(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    private UserDTO convertToDTO(UserModel user){
        UserDTO dto = new UserDTO();
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setEmail(user.getEmail());
        dto.setAddress(user.getAddress());
        return dto;
    }

}
