package com.mahesh.expensemanager.presenter;

import com.mahesh.expensemanager.database.ExpenseDatabaseHelper;
import com.mahesh.expensemanager.model.ExpenseType;
import com.mahesh.expensemanager.view.AddCategoryView;

public class CategoryPresenter {
  private final AddCategoryView view;
  private final ExpenseDatabaseHelper database;

  public CategoryPresenter(AddCategoryView view, ExpenseDatabaseHelper database) {
    this.view = view;
    this.database = database;
  }

  public boolean addCategory() {
    String newCategory = view.getCategory();
    if(newCategory.isEmpty()){
      view.displayError();
      return false;
    }

    database.addExpenseType(new ExpenseType(newCategory));
    return true;
  }
}
