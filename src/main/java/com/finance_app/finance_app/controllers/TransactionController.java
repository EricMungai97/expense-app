package com.finance_app.finance_app.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.finance_app.finance_app.service.TransactionService;
import com.finance_app.finance_app.models.TransactionModel;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<TransactionModel> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @PostMapping
    public TransactionModel saveTransactionModel(@RequestBody TransactionModel transaction) {
        return transactionService.saveTransactionModel(transaction);
    }

    @GetMapping("/{id}")
    public TransactionModel getTransactionById(@PathVariable Long id) {
        return transactionService.getTransactionById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransaction(id);
    }

    @GetMapping("/type/{type}")
    public List<TransactionModel> getTransactionsByType(@PathVariable String type) {
        return transactionService.getTransactionsByType(type);
    }

    @GetMapping("/category/{category}")
    public List<TransactionModel> getTransactionsByCategory(@PathVariable String category) {
        return transactionService.getTransactionsByCategory(category);
    }

    @GetMapping("/amount/{amount}")
    public List<TransactionModel> getTransactionsByAmount(@PathVariable double amount) {
        return transactionService.getTransactionsByAmount(amount);
    }

    @GetMapping("/description/{description}")
    public List<TransactionModel> getTransactionsByDescription(@PathVariable String description) {
        return transactionService.getTransactionsByDescription(description);
    }

    

    @GetMapping("/balance")
    public double calculateBalance() {
        return transactionService.calculateBalance();
    }

    @DeleteMapping()
    public void deleteAllTransactions() {
        transactionService.deleteAllTransactions();
    }
    
}
