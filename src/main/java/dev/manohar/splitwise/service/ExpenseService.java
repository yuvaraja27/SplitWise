package dev.manohar.splitwise.service;

import dev.manohar.splitwise.models.Expense;
import dev.manohar.splitwise.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;
    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }


}
