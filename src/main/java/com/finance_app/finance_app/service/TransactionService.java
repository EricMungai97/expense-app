package com.finance_app.finance_app.service;

import com.finance_app.finance_app.models.TransactionModel;
import com.finance_app.finance_app.repositories.TransactionRepository;
import org.springframework.stereotype.Service;


import java.util.*;;



@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public TransactionModel saveTransactionModel(TransactionModel transaction) {
        return transactionRepository.save(transaction);
    }

    public List<TransactionModel> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public TransactionModel getTransactionById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }
    public double calculateBalance() {
        return transactionRepository.findAll().stream()
                .mapToDouble(t -> t.getType().equals("income") ? t.getAmount() : -t.getAmount())
                .sum();
    }

    public List<TransactionModel> getTransactionsByType(String type) {
        return transactionRepository.findByType(type);
    }

    public List<TransactionModel> getTransactionsByCategory(String category) {
        return transactionRepository.findByCategory(category);
    }

    public List<TransactionModel> getTransactionsByAmount(double amount) {
        return transactionRepository.findByAmount(amount);
    }

    public List<TransactionModel> getTransactionsByDescription(String description) {
        return transactionRepository.findByDescription(description);
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }

    public void deleteAllTransactions() {
        transactionRepository.deleteAll();
    }
    
}
