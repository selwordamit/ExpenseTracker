package org.example.expensetracker.service;

import lombok.extern.java.Log;
import org.example.expensetracker.model.Expense;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {
    List<Expense> getAllUserExpenses(Long userID);
    List<Expense> getExpenseByDay(String date, Long userId);
    List<Expense> getExpenseByCategoryAndMonth(String category, String month, long userId);
    List<String> getAllExpenseCategories(Long userID);
    Optional<Expense> getExpenseById(Long id, Long userId);
    Expense addExpense(Expense expense, Long userId);
    boolean updateExpense(Expense expense, Long userId);
    boolean deleteExpense(Long id, Long userId);
}
