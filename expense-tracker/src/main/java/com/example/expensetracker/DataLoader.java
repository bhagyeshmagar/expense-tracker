package com.example.expensetracker;

import com.example.expensetracker.model.*;
import com.example.expensetracker.repository.ExpenseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final ExpenseRepository repo;
    public DataLoader(ExpenseRepository repo){ this.repo = repo; }

    @Override
    public void run(String... args){
        if(repo.count() == 0){
            repo.save(new Expense("Lunch", BigDecimal.valueOf(200), Category.FOOD, LocalDate.now(), "Paneer thali"));
            repo.save(new Expense("Bus Ticket", BigDecimal.valueOf(50), Category.TRAVEL, LocalDate.now().minusDays(1), "Pune local"));
        }
    }
}
