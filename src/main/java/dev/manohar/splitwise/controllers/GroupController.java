package dev.manohar.splitwise.controllers;

import dev.manohar.splitwise.dtos.GroupCreationRequestDTO;
import dev.manohar.splitwise.models.Group;
import dev.manohar.splitwise.models.User;
import dev.manohar.splitwise.repository.GroupRepository;
import dev.manohar.splitwise.service.GroupService;
import dev.manohar.splitwise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private  GroupRepository groupRepository;
    @Autowired
    private GroupService groupService;
    @Autowired
    private UserService userService;

    public GroupController(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @PostMapping("/create")
    public ResponseEntity createGroup(@RequestBody GroupCreationRequestDTO dto) {
        Group group = new Group();
        group.setGroupName(dto.getGroupName());
        List<User> users=new ArrayList<>();

        for(Integer integer:dto.getUserIds()){
            users.add(userService.findUserById(integer));
        }
        group.setUsers(users);
        Group group1=groupRepository.save(group);
        return ResponseEntity.ok().body("Group "+group.getGroupName()+" created");



    }
}
