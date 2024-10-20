package dev.manohar.splitwise.repository;

import dev.manohar.splitwise.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Integer> {
}
