package dev.manohar.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel{
    private String description;
    private Double amount;
    @ManyToOne
    private Group group;
    @OneToMany
    @JoinColumn(name="expense_id")
    private List<PayoutLedger> payoutLedgers;
}
