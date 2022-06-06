package com.mahesh.expensemanager.view;

import java.util.List;

import com.mahesh.expensemanager.model.Expense;

public interface TodaysExpenseView {
  void displayTotalExpense(Long totalExpense);
  void displayTodaysExpenses(List<Expense> expenses);
}
