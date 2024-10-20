package dev.manohar.splitwise.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ExpenseCreationReqDTO {
    private String description;
    private Double amount;
    private Integer groupId;
    private List<PayOut> payOuts;

}
