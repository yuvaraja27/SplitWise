package dev.manohar.splitwise.mapperutils;

import dev.manohar.splitwise.dtos.UserRequestDTO;
import dev.manohar.splitwise.models.Group;
import dev.manohar.splitwise.models.User;

public class RequestDTOMapper {
    public static User dtoToUser(UserRequestDTO userRequestDTO){
        User user = new User();
        user.setUsername(userRequestDTO.getUsername());
        user.setPassword(userRequestDTO.getPassword());
        user.setEmail(userRequestDTO.getEmail());

        return user;

    }

}
