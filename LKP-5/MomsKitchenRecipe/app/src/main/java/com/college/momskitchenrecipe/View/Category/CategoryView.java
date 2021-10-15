package com.college.momskitchenrecipe.View.Category;

import com.college.momskitchenrecipe.Model.Meals;

import java.util.List;

public interface CategoryView {
    void showLoading();
    void hideLoading();
    void setMeals(List<Meals.Meal> meals);
    void onErrorLoading(String message);
}
