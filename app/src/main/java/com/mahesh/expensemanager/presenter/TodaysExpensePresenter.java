package com.mahesh.expensemanager.presenter;

import java.util.List;

import com.mahesh.expensemanager.database.ExpenseDatabaseHelper;
import com.mahesh.expensemanager.model.Expense;
import com.mahesh.expensemanager.view.TodaysExpenseView;

public class TodaysExpensePresenter {

  private TodaysExpenseView view;
  private final List<Expense> expenses;

  public TodaysExpensePresenter(TodaysExpenseView view, ExpenseDatabaseHelper expenseDatabaseHelper) {
    this.view = view;
    expenses = expenseDatabaseHelper.getTodaysExpenses();
  }

  public void renderTotalExpense() {
    Long totalExpense = 0l;
    for (Expense expense : expenses)
      totalExpense += expense.getAmount();

    view.displayTotalExpense(totalExpense);
  }

  public void renderTodaysExpenses() {
    view.displayTodaysExpenses(expenses);
  }
}
