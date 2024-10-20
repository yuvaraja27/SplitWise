package dev.manohar.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "splitwise_group")
public class Group extends BaseModel{
    private String groupName;
    @ManyToMany
    private List<User> users;
    @OneToMany
    @JoinColumn(name ="group_id")
    private List<Expense> expenses;
    @OneToMany
    @JoinColumn(name="group_id")
    private List<Transaction> transactions;
}
