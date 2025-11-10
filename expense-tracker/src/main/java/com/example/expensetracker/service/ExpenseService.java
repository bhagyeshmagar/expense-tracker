package com.example.expensetracker.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;

/**
 * Service layer for Expense domain operations.
 * <p>
 * Provides read methods that return List/Optional as well as a convenience
 * {@link #findByIdOrNull(Long)} that returns the entity or null (useful for controllers).
 */
@Service
public class ExpenseService {

    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = Objects.requireNonNull(repo, "ExpenseRepository must not be null");
    }

    /**
     * Return all expenses.
     */
    public List<Expense> findAll() {
        return repo.findAll();
    }

    /**
     * Return an Optional for the expense with the given id.
     */
    public Optional<Expense> findById(Long id) {
        Objects.requireNonNull(id, "id must not be null");
        return repo.findById(id);
    }

    /**
     * Convenience method that returns the Expense or null if not found.
     *
     * Useful when the controller expects a plain entity and will redirect if null.
     */
    public Expense findByIdOrNull(Long id) {
        return findById(id).orElse(null);
    }

    /**
     * Save (insert or update) an expense.
     *
     * @param e expense to save; must not be null
     * @return saved expense (with id assigned)
     */
    @Transactional
    public Expense save(Expense e) {
        Objects.requireNonNull(e, "expense must not be null");
        return repo.save(e);
    }

    /**
     * Delete an expense by id.
     *
     * @param id id of expense to delete; must not be null
     */
    @Transactional
    public void delete(Long id) {
        Objects.requireNonNull(id, "id must not be null");
        repo.deleteById(id);
    }
}
