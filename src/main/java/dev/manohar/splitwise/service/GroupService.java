package dev.manohar.splitwise.service;

import dev.manohar.splitwise.exceptions.GroupNotFoundException;
import dev.manohar.splitwise.models.Group;
import dev.manohar.splitwise.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public Group createGroup(Group group) {
        return groupRepository.save(group);
    }
    public Group getGroupById(int id){
        return groupRepository.findById(id).orElseThrow(()-> new GroupNotFoundException("Group not found with id: "+id));
    }

}
