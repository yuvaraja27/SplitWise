package dev.manohar.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Transaction extends BaseModel{
    private double amount;
    @ManyToOne
    private Group group;
    @ManyToMany
    private List<User> parties;

}
