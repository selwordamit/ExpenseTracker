package org.example.expensetracker.repository;


import org.example.expensetracker.model.AppUser;
import org.example.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByUserIdOrderByDateDesc(Long userId);

    Optional<Expense> findByIdAndUserId(Long id, long userId);

    Long user(AppUser user);
    Optional<Expense> findByIdAndUserId(Long id, Long userId);
}
