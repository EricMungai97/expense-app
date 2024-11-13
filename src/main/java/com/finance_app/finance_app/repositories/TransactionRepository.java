package com.finance_app.finance_app.repositories;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.finance_app.finance_app.models.TransactionModel;

public interface TransactionRepository extends JpaRepository<TransactionModel, Long> {
    public List<TransactionModel> findByType(String type);
    public List<TransactionModel> findByCategory(String category);
    public List<TransactionModel> findByAmount(double amount);
    public List<TransactionModel> findByDescription(String description);
    
}
