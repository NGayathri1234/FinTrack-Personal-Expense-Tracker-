package com.example.fintrack.controller;

import com.example.fintrack.model.Expense;
import com.example.fintrack.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExpenseController {
    @Autowired
    private ExpenseRepository repo;

    @GetMapping("/")
    public String viewDashboard(Model model) {
        // 1. Fetch all expenses from the database
        var expenses = repo.findAll(); 
        
        // 2. Calculate the total using the list you just fetched
        double total = expenses.stream()
                               .mapToDouble(Expense::getAmount)
                               .sum();

        // 3. Add attributes to the model for Thymeleaf
        model.addAttribute("expenses", expenses);
        model.addAttribute("totalSpent", total);
        
        return "dashboard";
    }

    @PostMapping("/add")
    public String addExpense(@ModelAttribute Expense expense) {
        repo.save(expense);
        return "redirect:/";
    }
}