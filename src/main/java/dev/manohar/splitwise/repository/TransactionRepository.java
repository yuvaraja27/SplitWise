package dev.manohar.splitwise.repository;

import dev.manohar.splitwise.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
