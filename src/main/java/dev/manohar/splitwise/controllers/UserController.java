package dev.manohar.splitwise.controllers;

import dev.manohar.splitwise.dtos.UserRequestDTO;
import dev.manohar.splitwise.mapperutils.RequestDTOMapper;
import dev.manohar.splitwise.models.User;
import dev.manohar.splitwise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/create")
    public ResponseEntity createUser(@RequestBody UserRequestDTO dto) {

        User user= RequestDTOMapper.dtoToUser(dto);
        User createdUser = userService.createUser(user);
        return ResponseEntity.ok().body("Created user successfully");
    }
}
