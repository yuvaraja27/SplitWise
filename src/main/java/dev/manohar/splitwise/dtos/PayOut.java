package dev.manohar.splitwise.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayOut {
    private int userId;
    private double paidAmount;
    private double owedAmount;

}
