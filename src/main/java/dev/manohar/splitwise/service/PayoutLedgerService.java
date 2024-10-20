package dev.manohar.splitwise.service;

import dev.manohar.splitwise.models.PayoutLedger;
import dev.manohar.splitwise.repository.PayoutLedgerRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayoutLedgerService {
    @Autowired
    private PayoutLedgerRepository payoutLedgerRepository;
    public PayoutLedger create(PayoutLedger payoutLedger) {
        return payoutLedgerRepository.save(payoutLedger);
    }
}
