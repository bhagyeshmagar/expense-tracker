package com.example.expensetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.expensetracker.model.Category;
import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;

@Controller
public class ExpenseController {
    private final ExpenseService service;
    public ExpenseController(ExpenseService service){ this.service = service; }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("expenses", service.findAll());
        return "dashboard";
    }

    @GetMapping("/expenses")
    public String list(Model model){
        model.addAttribute("expenses", service.findAll());
        model.addAttribute("categories", Category.values());
        return "expenses";
    }

    @GetMapping("/expenses/new")
    public String newForm(Model model){
        model.addAttribute("expense", new Expense());
        model.addAttribute("categories", Category.values());
        return "expense-form";
    }

    // EDIT: load an existing expense into the same form
    @GetMapping("/expenses/edit/{id}")
public String editForm(@PathVariable Long id, Model model) {
    // if your service returns Optional:
    Expense expense = service.findById(id).orElse(null);
    // OR, if you applied the updated service above:
    // Expense expense = service.findByIdOrNull(id);

    if (expense == null) {
        return "redirect:/expenses";
    }
    model.addAttribute("expense", expense);
    model.addAttribute("categories", Category.values());
    return "expense-form";
}

    @PostMapping("/expenses")
    public String save(@ModelAttribute Expense e){
        if (e != null) {
            service.save(e);
        }
        return "redirect:/expenses";
    }

    @GetMapping("/expenses/delete/{id}")
    public String delete(@PathVariable long id){
        service.delete(id);
        return "redirect:/expenses";
    }
}
