package dev.manohar.splitwise.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Setter
@Getter
public class GroupCreationRequestDTO {
    private String groupName;
    List<Integer> userIds;

}
