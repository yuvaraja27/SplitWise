package dev.manohar.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "customer")
@Setter
@Getter

public class User extends BaseModel{
    private String username;
    private String password;
    private String email;
    @ManyToMany
    private List<Group> groups;
    @ManyToMany
    private List<Transaction> transactions;
    @ManyToMany
    private List<Expense> expenses;

}
