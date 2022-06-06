package com.mahesh.expensemanager.view;

import java.util.List;
import java.util.Map;

import com.mahesh.expensemanager.model.Expense;

public interface CurrentWeekExpenseView {
  void displayCurrentWeeksExpenses(Map<String, List<Expense>> expensesByDate);

  void displayTotalExpenses(Long totalExpense);
}
