package org.example.expensetracker.service;

import lombok.extern.java.Log;
import org.example.expensetracker.model.Expense;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {
    List<Expense> getExpenseByDay(String date);
    List<Expense> getExpenseByCategoryAndMonth(String category, String month);
    List<String> getAllExpenseCategories();
    Optional<Expense> getExpenseById(Long id);
    Expense addExpense(Expense expense);
    boolean updateExpense(Expense expense);
    boolean deleteExpense(Long id);
}
