package dev.manohar.splitwise.controllers;

import dev.manohar.splitwise.dtos.ExpenseCreationReqDTO;
import dev.manohar.splitwise.dtos.PayOut;
import dev.manohar.splitwise.models.Expense;
import dev.manohar.splitwise.models.Group;
import dev.manohar.splitwise.models.PayoutLedger;
import dev.manohar.splitwise.repository.PayoutLedgerRepository;
import dev.manohar.splitwise.service.ExpenseService;
import dev.manohar.splitwise.service.GroupService;
import dev.manohar.splitwise.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/expense")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;
    @Autowired
    private GroupService groupService;
    @Autowired
    private UserService userService;
    @Autowired
    private PayoutLedgerRepository ledgerRepository;

    @PostMapping("/create")
    public ResponseEntity addExpense(@RequestBody ExpenseCreationReqDTO dto){
        Expense expense=new Expense();
        expense.setAmount(dto.getAmount());
        expense.setDescription(dto.getDescription());
        Group group=groupService.getGroupById(dto.getGroupId());
        expense.setGroup(group);
        List<PayoutLedger> payoutLedgers=new ArrayList<>();
        for(PayOut payOut:dto.getPayOuts()){
            PayoutLedger payoutLedger=new PayoutLedger();
            payoutLedger.setUser(userService.findUserById(payOut.getUserId()));
            payoutLedger.setAmountPaid(payOut.getPaidAmount());
            payoutLedger.setAmountOwed(payOut.getOwedAmount());
            PayoutLedger payoutLedger1=ledgerRepository.save(payoutLedger);
            payoutLedgers.add(payoutLedger1);
        }
        expense.setPayoutLedgers(payoutLedgers);
        expenseService.createExpense(expense);
        return ResponseEntity.ok().body(expense);
    }
}
