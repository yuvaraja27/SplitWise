package dev.manohar.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class PayoutLedger extends BaseModel {
    @ManyToOne
    private Expense expense;
    @ManyToOne
    private User user;
    private double amountPaid;
    private double amountOwed;




}
