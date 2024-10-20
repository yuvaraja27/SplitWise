package dev.manohar.splitwise.repository;

import dev.manohar.splitwise.models.PayoutLedger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayoutLedgerRepository extends JpaRepository<PayoutLedger,Integer> {
}
